Feature: Student management
  To manage students
  As a time planner
  I want to get a list of Students
  
  Scenario: Show a list of students
    Given 3 Students, Per, Paal and Espen
    When I visit the students page
    Then I should see "3 students"
    And I should see "Per, Paal, Espen"
