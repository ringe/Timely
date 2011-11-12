class CreateAccessories < ActiveRecord::Migration
  def change
    create_table :accessories do |t|
      t.integer :room_id
      t.string :name
      t.string :value

      t.timestamps
    end
  end
end
