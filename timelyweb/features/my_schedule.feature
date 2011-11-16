Feature: My Schedule
  As a Student or a Teacher I want to see my schedule.
  
  Scenario: Student views his empty schedule
    Given I am a Student
    When I open my schedule
    Then I should see "no events found"