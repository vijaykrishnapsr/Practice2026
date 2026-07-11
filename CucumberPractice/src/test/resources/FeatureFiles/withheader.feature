@smoke
Feature: Login feature validation

  Scenario: Verify login page with valid credentials
    Given Launch the application
    When the user entering username and password
      | username | password    |
      | student  | Password123 |
      | staff    | Test@123    |
      | staff1   | Test@123    |
    And the user clicks the submit button
    Then the user should be successfully logged in to the application
