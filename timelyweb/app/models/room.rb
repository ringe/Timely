class Room < ActiveRecord::Base
  has_many :accessories
  has_and_belongs_to_many :events
end
