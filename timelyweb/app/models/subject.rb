class Subject < ActiveRecord::Base
  # One Subject taks place in one term (and eventually gets duplicated for another term)
  belongs_to :term

  # There is one responsible Person per Subject
  belongs_to :person

  # A Subject can have several teachers
  belongs_to :teacher_group, class_name: "Group"

  # A Subject belongs to a Group of students
  belongs_to :student_group, class_name: "Group"

  # Subject has many Events
  has_many :events
end
