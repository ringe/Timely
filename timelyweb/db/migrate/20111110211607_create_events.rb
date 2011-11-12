class CreateEvents < ActiveRecord::Migration
  def change
    create_table :events do |t|
      t.integer :subject_id
      t.integer :owner_id
      t.string :owner_type
      t.boolean :is_private
      t.integer :override_id
      t.integer :parent_id
      t.datetime :start
      t.datetime :end
      t.string :name

      t.timestamps
    end
  end
end
