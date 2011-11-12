class Subject < ActiveRecord::Base
  # One Subject taks place in one term (and eventually gets duplicated for another term)
  belongs_to :term

  # There is one responsible Person per Subject
  belongs_to :responsible, class_name: "Person"

  # A Subject can have several teachers
  belongs_to :teachers, class_name: "Group", foreign_key: "teacher_group_id"

  # A Subject belongs to a Group of students
  belongs_to :students, class_name: "Group", foreign_key: "student_group_id"

  # Subject has many Events
  has_many :events
end
