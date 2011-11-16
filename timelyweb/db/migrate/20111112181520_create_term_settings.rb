class CreateTermSettings < ActiveRecord::Migration
  def change
    create_table :term_settings do |t|
      t.integer :school_term_id
      t.string :name
      t.string :value

      t.timestamps
    end
  end
end
