class Person < ActiveRecord::Base
  # Include default devise modules. Others available are:
  # TODO: Must figure out how to create a token based on Asbjørn's AD auth URL
  devise :rememberable, :trackable, :token_authenticatable

  # Setup accessible (or protected) attributes for your model
  attr_accessible :remember_me, :firstname, :lastname, :email, :private_email, :phone

  # A Person owns events
  has_many :events, as: "owner"

  has_many :user_settings
  
  has_many :subjects
  
  has_and_belongs_to_many :groups

  validates_presence_of :firstname, :lastname
  validates_uniqueness_of :email, :case_sensitive => false
end
