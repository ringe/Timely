Feature: Models
  To meet the requirements
  As a developer
  I want to implement the models according to the DataModel

  Scenario: Room and relationships
    Given The Room model is defined correctly
    Given A Room
    When 2 accessories are placed there
    When 2 events take place at the same time
    Then Room should have 2 Accessories
    And Room should have 1 conflict
    And Room should have 2 events overlapping
