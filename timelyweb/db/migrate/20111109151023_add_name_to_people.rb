class AddNameToPeople < ActiveRecord::Migration
  def change
    add_column :people, :firstname, :string
    add_column :people, :lastname, :string
  end
end
