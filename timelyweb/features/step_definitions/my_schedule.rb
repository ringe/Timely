Given /^I am a Student$/ do
  s=Student.new
  s.firstname = 'Ola'
  s.lastname = 'Nordmann'
  s.save
end

When /^I open my schedule$/ do
  visit("/schedule")
end