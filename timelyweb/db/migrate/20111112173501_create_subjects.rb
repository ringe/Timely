class CreateSubjects < ActiveRecord::Migration
  def change
    create_table :subjects do |t|
      t.integer :term_id
      t.integer :person_id
      t.integer :teacher_group_id
      t.integer :student_group_id
      t.string :name
      t.string :code
      t.text :description

      t.timestamps
    end
  end
end
