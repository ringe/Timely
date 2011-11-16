require 'factory_girl'

Factory.define :student do |u|
  u.firstname 'Test'
  u.lastname 'User'
  u.email 'user@test.com'
end

