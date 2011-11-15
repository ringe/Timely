class CreateSchoolTerms < ActiveRecord::Migration
  def change
    create_table :school_terms do |t|
      t.string :name
      t.date :start
      t.date :end

      t.timestamps
    end
  end
end
