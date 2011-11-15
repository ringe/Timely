class Group < ActiveRecord::Base
  # A Group owns events
  has_many :events, as: "owner"
  
  # Group has groups or is in group
  has_many :sub_groups, class_name: "Group", foreign_key: "parent_id"
  belongs_to :parent, class_name: "Group", foreign_key: "parent_id"

end