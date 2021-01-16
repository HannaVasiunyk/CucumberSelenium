Feature: Google test

  Scenario: click on button
    Given I open google page
    Then I click on "Мені пощастить" button
    And I verify that the date is present
    Then Close chrome
