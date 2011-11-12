class StudentGroup < Group
  # Has Subjects with this groups id in the student_group_id field of the subjects table
  has_many :subjects, :foreign_key => "student_group_id"
end
