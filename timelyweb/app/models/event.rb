class Event < ActiveRecord::Base
  include Comparable

  # An Event is owned by a Person or a Group
  belongs_to :owner, polymorphic: true, readonly: true

  # An Event belongs to a Subject
  belongs_to :subject

  # An Event can have sub events and also be a sub event
  # We thought one event is the start of a series and all following events in the series
  # are under the first (under a paralell, instead of serial, relationship to the first)
  # TODO: bad naming of fields
  has_many :sub_events, class_name: "Event"
  belongs_to :parent, class_name: "Event", foreign_key: "parent_id"

  # Events and Rooms can have many of each
  has_and_belongs_to_many :rooms

  # Compare events based on start time
  def <=>(event)
    if self.start < event.start
      -1
    elsif self.start > event.start
      1
    else
      0
    end
  end

  # Check to see if an event overlaps with this one, time-wise
  def time_overlap(event)
    (event.start < self.end && event.start > self.start) or
    (self.start < event.end && self.start > event.start)
  end
  alias_method :&, :time_overlap
end
