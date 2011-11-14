class AddDetailsToPeople < ActiveRecord::Migration
  def change
    add_column :people, :private_email, :string
    add_column :people, :phone, :string
  end
end
