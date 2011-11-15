require 'capybara/cucumber'
require 'capybara/rspec'

Given /^The Room model is defined correctly$/ do
  room = Room.new
  room.id
  room.code
  room.category
  room.capacity
  room.capacity_exam
  room.description
  room.accessories
end

Given /^A Room$/ do
  @room = Room.create!(:code => "test")
end

When /^(\d+) accessories are placed there$/ do |n|
  i=0
  n.to_i.times do
    @room.accessories << Accessory.create!(:name => "A #{i}")
    i+=1
  end
end

Then /^Room should have (\d+) Accessories$/ do |n|
  @room.accessories.count.should == n.to_i
end

When /^(\d+) events take place at the same time$/ do |n|
  i=10.minutes
  n.to_i.times do
    @room.events << Event.create!(start: Time.now+i, end: Time.now+i+1.hour)
    i+=10.minutes
  end
end

Then /^Room should have (\d+) events overlapping$/ do |arg1|
  pending # express the regexp above with the code you wish you had
end
