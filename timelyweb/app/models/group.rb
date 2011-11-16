class Group < ActiveRecord::Base
  # A Group owns events
  has_many :events, as: "owner"
  
  has_and_belongs_to_many :people
  
  # Group has groups or is in group
  has_many :sub_groups, class_name: "Group", foreign_key: "parent_id"
  belongs_to :parent, class_name: "Group", foreign_key: "parent_id"

end
