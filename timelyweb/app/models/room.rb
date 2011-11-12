class Room < ActiveRecord::Base
  has_many :accessories
  has_and_belongs_to_many :events

  def conflicts
    diff = events - events.uniq
    return diff.count
  end
end
