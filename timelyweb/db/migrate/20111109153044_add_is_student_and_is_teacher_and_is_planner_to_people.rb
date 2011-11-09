class AddIsStudentAndIsTeacherAndIsPlannerToPeople < ActiveRecord::Migration
  def change
    add_column :people, :is_student, :boolean
    add_column :people, :is_teacher, :boolean
    add_column :people, :is_planner, :boolean
  end
end
