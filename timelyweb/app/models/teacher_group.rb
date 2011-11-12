class TeacherGroup < Group
  # Has Subjects with this groups id in the teacher_group_id field of the subjects table
  has_many :subjects, :foreign_key => "teacher_group_id"
end
