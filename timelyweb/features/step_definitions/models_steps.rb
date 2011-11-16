Given /^A Room$/ do
  @room = Room.create!(:code => "test")
end

When /^(\d+) accessories are placed in the Room$/ do |n|
  i=0
  n.to_i.times do
    @room.accessories << Accessory.create!(:name => "A #{i}")
    i+=1
  end
end

Then /^Room should have (\d+) Accessories$/ do |n|
  assert @room.accessories.count.should == n.to_i
end

And /^Two events take place at the same time$/ do
  i=0.minutes
  2.times do
    @room.events << Event.create!(start: Time.now+i, end: Time.now+i+1.hour)
    i+=10.minutes
  end
end

Then /^Room should have two events overlapping$/ do
   assert @room.events.first & @room.events.last
end

Given /^A SchoolTerm, "([^"]*)"$/ do |name|
  @term = SchoolTerm.create!(:name => name)
end

Given /^The SchoolTerm have (\d+) TermSettings$/ do |n|
  n.to_i.times do
    @term.term_settings << TermSetting.create!()
  end
end

Given /^The SchoolTerm have (\d+) Subjects$/ do |n|
  n.to_i.times do
    @term.subjects << Subject.create!()
  end
end
 
Then /^The SchoolTerm should have (\d+) TermSettings and (\d+) Subjects$/ do |ts, s|
  assert @term.term_settings.count.should == ts.to_i and @term.subjects.count.should == s.to_i
end

Given /^"([^"]*)" is responsible for "([^"]*)"$/ do |person, subject|
  fname,lname = person.split
  teacher = Teacher.create(:firstname => fname, :lastname => lname)
  @subject = Subject.where(:name => subject).first
  if !@subject.nil?
    @subject.person = teacher
    @subject.save!
  else
    @subject = Subject.create!(:name => subject, :person => teacher)
  end
end

Given /^"([^"]*)" has (\d+) Teachers$/ do |subject, n|
  @subject = Subject.where(:name => subject).first
  @subject.teacher_group = TeacherGroup.create!
  @subject.save!
  n.to_i.times do
    @subject.teacher_group.people << Teacher.create!(:firstname => "T.", :lastname => "Eacher")
  end
end

Given /^(\d+) Students in "([^"]*)"$/ do |n, name|
  sg = StudentGroup.create!(:name => name)
  n.to_i.times do
    sg.people << Student.create!(:firstname => "S.", :lastname => "Tudent")
  end
end

Given /^"([^"]*)" follow the Subject "([^"]*)"$/ do |group, subject|
  s = Subject.where({:name => subject}).first
  s.student_group = Group.where({:name => group}).first
  s.save!
end

Given /^A Subject, "([^"]*)"$/ do |name|
  @subject = Subject.create!(:name => name)
end

Then /^"([^"]*)" should be under "([^"]*)", have (\d+) Teachers and (\d+) Students$/ do |subject, person, teachers, students|
  s = Subject.where({:name => subject}).first
  assert ("#{s.person.firstname} #{s.person.lastname}").should == person
  assert s.teacher_group.people.count.should == teachers.to_i
  assert s.student_group.people.count.should == students.to_i
end

Then /^I should have (\d+) Groups$/ do |n|
  assert Group.count.should == n.to_i
end

Then /^I should have (\d+) StudentGroup with (\d+) Students$/ do |groups, students|
  sgs = StudentGroup.all
  assert sgs.size.should == groups.to_i
  sgs.each do |sg|
    assert sg.people.size.should == students.to_i
    sg.people.each do |student|
      assert student.class.should == Student
    end
  end
end

Then /^I should have (\d+) TeacherGroup with (\d+) Teachers$/ do |groups, teachers|
  tgs = TeacherGroup.all
  assert tgs.size.should == groups.to_i
  tgs.each do |tg|
    assert tg.people.size.should == teachers.to_i
    tg.people.each do |teacher|
      assert teacher.class.should == Teacher
    end
  end
end