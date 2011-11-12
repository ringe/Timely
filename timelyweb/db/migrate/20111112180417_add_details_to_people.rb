class AddDetailsToPeople < ActiveRecord::Migration
  def change
    add_column :people, :firstname, :string
    add_column :people, :lastname, :string
    add_column :people, :email, :string
    add_column :people, :private_email, :string
    add_column :people, :phone, :string
  end
end
