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
    Given The responsible Person of "Programming in Ruby" is "Nils Skulbru"
    Given "Programming in Ruby" has 2 Teachers
    Given 25 Students in "Yvei 2009"
    Given "Yvei 2009" follow the Subject "Programming in Ruby"
    Then The Person "Nils Skulbru" should have the subject "Programming in Ruby"
    And "Programming in Ruby" should have 2 Teachers and 25 Students

  Scenario: Groups
    Given 4 Students in "Yvei 2009"
    Given "The subject" has 4 Teachers
    Then I should have 2 Groups
    And I should have 1 StudentGroup with 4 Students
    And I should have 1 TeacherGroup with 4 Teachers
