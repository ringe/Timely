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

ActiveRecord::Schema.define(:version => 20111112181520) do

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
    t.datetime "start"
    t.datetime "end"
    t.string   "name"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "events_rooms", :id => false, :force => true do |t|
    t.integer "event_id", :null => false
    t.integer "room_id",  :null => false
  end

  add_index "events_rooms", ["event_id", "room_id"], :name => "index_events_rooms_on_event_id_and_room_id", :unique => true

  create_table "groups", :force => true do |t|
    t.string   "name"
    t.integer  "parent_id"
    t.string   "type"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "groups_people", :id => false, :force => true do |t|
    t.integer "group_id",  :null => false
    t.integer "person_id", :null => false
  end

  add_index "groups_people", ["group_id", "person_id"], :name => "index_groups_people_on_group_id_and_person_id", :unique => true

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
    t.string   "private_email"
    t.string   "phone"
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

  create_table "subjects", :force => true do |t|
    t.integer  "term_id"
    t.integer  "person_id"
    t.integer  "teacher_group_id"
    t.integer  "student_group_id"
    t.string   "name"
    t.string   "code"
    t.text     "description"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "term_settings", :force => true do |t|
    t.integer  "term_id"
    t.string   "name"
    t.string   "value"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "terms", :force => true do |t|
    t.string   "name"
    t.date     "start"
    t.date     "end"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "user_settings", :force => true do |t|
    t.integer  "person_id"
    t.string   "name"
    t.string   "value"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
