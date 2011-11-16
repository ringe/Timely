class EventsController < ApplicationController
  def index
    @student = Student.first
  end

end
