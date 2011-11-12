class CreateUserSettings < ActiveRecord::Migration
  def change
    create_table :user_settings do |t|
      t.integer :person_id
      t.string :name
      t.string :value

      t.timestamps
    end
  end
end
