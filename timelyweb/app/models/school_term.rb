class SchoolTerm < ActiveRecord::Base
  has_many :term_settings
  has_many :subjects
end
