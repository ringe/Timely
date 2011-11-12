class CreateRooms < ActiveRecord::Migration
  def change
    create_table :rooms do |t|
      t.string :code
      t.string :category
      t.integer :capacity
      t.integer :capacity_exam
      t.text :description

      t.timestamps
    end
  end
end
