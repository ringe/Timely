class Event < ActiveRecord::Base
  include Comparable

  has_and_belongs_to_many :rooms

  # Compare events based on start time
  def <=>(event)
    if self.start_time < event.start_time
      -1
    elsif self.start_time > event.start_time
      1
    else
      0
    end
  end

  # Check to see if an event overlaps with this one, time-wise
  def time_overlap(event)
    (event.start_time < self.end_time && event.start_time > self.start_time) or
    (self.start_time < event.end_time && self.start_time > event.start_time)
  end
  alias_method :&, :time_overlap
end
