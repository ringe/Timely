Given /^I am a Student with id (\d+)$/ do |id|
  @student = FactoryGirl.build(:student, :id => id)
end

Given /^I visit ([^"]*)$/ do |page_name|
  visit path_to(page_name)
end

Then /^I should see the login form$/ do
  pending # express the regexp above with the code you wish you had
end

When /^I fill in username with (\d+)$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end

When /^I fill in password with "([^"]*)"$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end

Then /^I should be logged in$/ do
  pending # express the regexp above with the code you wish you had
end

Given /^I am logged in$/ do
  Given "I am a Student with id 123434"
end
