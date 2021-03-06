Given /^the file "([^"]*)"$/ do |file|
  require "iconv"
  @file = file
  contents = File.open(@file).read
  output = Iconv.conv('UTF-8//IGNORE', 'ANSI_X3.4-1986', contents)
  bork = File.open(@file, 'w')
  bork.write(output)
  bork.close
  assert File.exist?(@file);
end

When /^I convert the content to rooms$/ do
    CSV.foreach(@file, :col_sep => ";") do |row|
      if row[0] == "rom_id"
        #SKIP LULZ
      else
        r = Room.new
        #r.id = row[0]
        r.code = row[0]
        r.category = row[15]
        r.capacity = row[7].to_i
        r.capacity_exam = row[6].to_i
        r.description = row[9]
        r.save!
      end
    end
end

Then /^I should have (\d+) rooms$/ do |k|
  assert Room.count.should == k.to_i
end

When /^I convert the content to Students$/ do
    CSV.foreach(@file, :col_sep => ";") do |row|
      if row[0] == "studentnr"
        #SKIP LULZ
      else
        r = Student.new
        r.id = row[0]
        r.email = row[7]
        r.private_email = row[8]
        r.phone = row[11]
        r.firstname = row[4]
        r.lastname = row[3]
        r.save!
      end
    end
end

Then /^I should have (\d+) students$/ do |k|
  assert Student.count.should == k.to_i
end

When /^i extract the Rooms from the file$/ do
  CSV.foreach(@file, :col_sep => ";") do |row|
    if row[0] == "Rom-ID"
      #SKIP LULZ
    else
      romacc = Accessory.new
      i = 0
      p = 2
      steringue = ""
      while i < row[1].to_i
        steringue += row[p]
        steringue += ", "
        p+=1
        i+=1
      end
      romacc.room_id = row[0]
      romacc.value = steringue
      romacc.save!
    end
  end
end

Then /^I should have (\d+) Rooms with Accessories$/ do |k|
  assert Accessory.count.should == k.to_i
end

When /^I convert the content to Teachers$/ do
  CSV.foreach(@file, :col_sep => ";") do |row|
      if row[0] == "personlopenr"
        #SKIP LULZ
      else
        r = Teacher.new
        r.id = row[0]
        r.email = row[7]
        r.private_email = row[8]
        r.phone = row[11]
        r.firstname = row[5]
        r.lastname = row[4]
        r.save!
      end
    end
end

Then /^I should have (\d+) teachers$/ do |s|
assert Teacher.count.should == s.to_i
end

When /^I convert the content to Classes$/ do
  CSV.foreach(@file, :col_sep => ";") do |row|
    if row[0] == "klasse_id"
      #SKIP LULZ
    else
      r = StudentGroup.new
      r.name = row[0]
      r.save!
    end
  end
end

Then /^I should have (\d+) Classes$/ do |n|
  assert Group.count.should == n.to_i
end

When /^I assign Students to Groups$/ do
  CSV.foreach(@file, :col_sep => ";") do |row|
    if row[0] == "Klasse-ID"
      #SKIPZ!
    else
      n = 0
      group = Group.new
      group.name = row[0]
      while n < row[1].to_i
        gp = Student.where(id: row[n+2].to_i).first
        gp.groups << group
        n += 1
        gp.save!
      end
      group.save!
    end
  end
end

Then /^I should have (\d+) different Student in (\d+) Groups$/ do |students, groups|
  @done = false
  @counts = 0
  look = Group.find(:all)
  look.each do |g|
    @counts += g.people.count
  end
  if @counts == 3 && Group.count == 3
    @done = true
  end
  assert @done
end