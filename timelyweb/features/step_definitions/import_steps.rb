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

When /^I read the contents of the file$/ do
  #Unødvendig.
end

When /^I convert the content to rooms$/ do
    CSV.foreach(@file, :col_sep => ";") do |row|
      if row[0] == "rom_id"
        #SKIP LULZ
      else
        r = Room.new
        #r.id = row[0]
        r.code = row[1]
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
