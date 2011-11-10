require 'capybara/cucumber'
require 'capybara/rspec'

Given /the greeting is ([A-z]*)/ do |greeting|
  @greeting = greeting
end

When /the name is ([A-z]*)/ do |name|
  @name = name
end

Then /the phrase is (.*)/ do |phrase|
  phrase.should == @greeting + ", " + @name
end

When /^someone visits the front page$/ do
  visit('/')
end

Then /^he should see public events$/ do
  assert page.should have_xpath("//title", :text => "Timely")
end

Then /^I should see "(.*)"$/ do |text|
  assert page.should have_content(text)
end
