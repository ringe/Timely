require 'factory_girl'

Factory.define :student, :class => Student do |u|
  u.firstname 'Test'
  u.lastname 'User'
  u.email 'user@test.com'
end
