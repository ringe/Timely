Feature: Rails is Ready
  To ensure I have things ready
  As a developer
  I want to run a quick Cucumber test

  Scenario: Hello World
    Given the greeting is Hello
    When the name is World
    Then the phrase is Hello, World

  Scenario: Guest visit the front page
    When someone visits the front page
    Then he should see public events
    And I should see "Welcome!"
