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
  assert @school.term_settings.count.should == ts.to_i and @school.subjects.count.should == s.to_i
end

Given /^The responsible Person of "([^"]*)" is "([^"]*)"$/ do |subject, person|
  fname,lname = person.split
  teacher = Person.create!(:firstname => fname, :lastname => lname)
  Subject.create!(:name => subject, :person => teacher)
end

Given /^"([^"]*)" has (\d+) Teachers$/ do |subject, n|
  @subject = Subject.find_by_name(subject)
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
  s = Subject.find_by_name(subject)
  s.student_group = Group.find_by_name(group)
  s.save!
end

Then /^The Person "([^"]*)" should have the subject "([^"]*)"$/ do |person, subject|
  fname,lname = person.split
  p=Person.find_by_firstname_and_lastname(fname, lname)
  assert p.subjects.include?(Subject.find_by_name(subject))
end

Then /^"([^"]*)" should have (\d+) Teachers and (\d+) Students$/ do |subject, teachers, students|
  s = Subject.find_by_name(subject)
  assert s.teacher_group.people.count.should == teachers.to_i
  assert s.student_group.people.count.should == students.to_i
end