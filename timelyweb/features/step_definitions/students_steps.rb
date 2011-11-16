Given /^(\d+) Students, (.*)$/ do |n,names|
  #Per, Paal and Espen
  names = names.gsub(" ", "").sub("and", ",").split(",")
  assert names.length.should == n.to_i
  names.each do |name|
    s = Student.new
    s.firstname = name
    s.lastname = "Nordmann"
    s.save
  end
  assert Student.count.should == n.to_i
end

When /^I visit the students page$/ do
  visit("/students")
end