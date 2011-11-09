class Person < ActiveRecord::Base
  # Include default devise modules. Others available are:
  # TODO: Must figure out how to create a token based on Asbjørn's AD auth URL
  devise :rememberable, :trackable, :token_authenticatable

  # Setup accessible (or protected) attributes for your model
  attr_accessible :email, :password, :password_confirmation, :remember_me
end
