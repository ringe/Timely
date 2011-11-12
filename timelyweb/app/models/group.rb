class Group < ActiveRecord::Base
  # A Group owns events
  has_many :events, as: "owner"
  
  # Group has groups or is in group
  has_many :sub_groups, class_name: "Group", type: self.type
  belongs_to :parent, class_name: "Group", foreign_key: "parent_id", type: self.type

end
