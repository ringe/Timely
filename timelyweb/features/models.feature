Feature: Models
  To meet the requirements
  As a developer
  I want to implement the models according to the DataModel

  Scenario: Room
    Given A Room
    When 2 accessories are placed in the Room
    And Two events take place at the same time
    Then Room should have 2 Accessories
    And Room should have two events overlapping

  Scenario: SchoolTerm
    Given A SchoolTerm, "Fall 2011"
    Given The SchoolTerm have 2 TermSettings
    Given The SchoolTerm have 3 Subjects
    Then The SchoolTerm should have 2 TermSettings and 3 Subjects
    
  Scenario: Subject
    Given A Subject, "Programming in Ruby"
    Given "Nils Skulbru" is responsible for "Programming in Ruby" 
    Given "Programming in Ruby" has 2 Teachers
    Given 25 Students in "Yvei 2009"
    Given "Yvei 2009" follow the Subject "Programming in Ruby"
    Then "Programming in Ruby" should be under "Nils Skulbru", have 2 Teachers and 25 Students

  Scenario: Groups
    Given A Subject, "The Subject"
    Given 4 Students in "Yvei 2009"
    Given "The Subject" has 5 Teachers
    Then I should have 2 Groups
    And I should have 1 StudentGroup with 4 Students
    And I should have 1 TeacherGroup with 5 Teachers
