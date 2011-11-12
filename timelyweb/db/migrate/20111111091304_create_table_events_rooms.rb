class CreateTableEventsRooms < ActiveRecord::Migration
  def up
    create_table :events_rooms, :id => false do |t|
      t.references :event, :null => false
      t.references :room, :null => false
    end

    add_index(:events_rooms, [:event_id, :room_id], unique: true)
  end

  def down
    drop_table :events_rooms
  end
end
