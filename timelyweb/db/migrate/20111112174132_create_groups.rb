class CreateGroups < ActiveRecord::Migration
  def change
    create_table :groups do |t|
      t.string :name
      t.integer :parent_id
      t.string :type

      t.timestamps
    end
  end
end
