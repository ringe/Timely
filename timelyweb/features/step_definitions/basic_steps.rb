Given /the greeting is ([A-z]*)/ do |greeting|
  @greeting = greeting
end

When /the name is ([A-z]*)/ do |name|
  @name = name
end

Then /the phrase is (.*)/ do |phrase|
  phrase.should == @greeting + ", " + @name
end
