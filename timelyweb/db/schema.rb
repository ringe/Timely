# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended to check this file into your version control system.

ActiveRecord::Schema.define(:version => 20111111091304) do

  create_table "accessories", :force => true do |t|
    t.integer  "room_id"
    t.string   "name"
    t.string   "value"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "events", :force => true do |t|
    t.integer  "subject_id"
    t.integer  "owner_id"
    t.string   "owner_type"
    t.boolean  "is_private"
    t.integer  "override_id"
    t.integer  "parent_id"
    t.datetime "start_time"
    t.datetime "end_time"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "events_rooms", :id => false, :force => true do |t|
    t.integer "event_id", :null => false
    t.integer "room_id",  :null => false
  end

  add_index "events_rooms", ["event_id", "room_id"], :name => "index_events_rooms_on_event_id_and_room_id", :unique => true

  create_table "people", :force => true do |t|
    t.string   "remember_token"
    t.datetime "remember_created_at"
    t.integer  "sign_in_count",        :default => 0
    t.datetime "current_sign_in_at"
    t.datetime "last_sign_in_at"
    t.string   "current_sign_in_ip"
    t.string   "last_sign_in_ip"
    t.string   "authentication_token"
    t.string   "email"
    t.datetime "created_at"
    t.datetime "updated_at"
    t.string   "firstname"
    t.string   "lastname"
    t.boolean  "is_student"
    t.boolean  "is_teacher"
    t.boolean  "is_planner"
  end

  add_index "people", ["authentication_token"], :name => "index_people_on_authentication_token", :unique => true
  add_index "people", ["email"], :name => "index_people_on_email", :unique => true

  create_table "rooms", :force => true do |t|
    t.string   "code"
    t.string   "category"
    t.integer  "capacity"
    t.integer  "capacity_exam"
    t.text     "description"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
