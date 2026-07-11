Feature: Validating login screen

  Scenario Outline: Validating login page with valid credentials
    Given user launches the application
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then the user should be successfully logged in

    Examples:
      | username | password    |
      | student  | Password123 |
      | student1 | Password456 |
