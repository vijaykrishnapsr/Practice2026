Feature: Verify login functionality

  Background: 
    Given Launching the application
    And User navigates to Home page

@smoke
  Scenario: Verify login page with valid credentials
    Given Launch the application
    When the user enters username and password
    And the user clicks the submit button
    Then the user should be successfully logged in to the application

@sanity
  Scenario: Verify login page with valid credentials
    Given Launch the application
    When the user enter username and password
      | datatable1 | Password |
      | datatable2 | Test@123 |
    And the user clicks the submit button
    Then the user should be successfully logged in to the application

@regression
  Scenario: Verify login page with valid credentials
    Given Launch the application
    When the user entering username and password
      | username             | password |
      | datatable1withheader | Password |
      | datatable2withheader | Test@123 |
    And the user clicks the submit button
    Then the user should be successfully logged in to the application

@sanity
  Scenario Outline: Verify login page with multiple credentials
    Given Launch the application
    When the user enters "<username>" and "<password>"
    And the user clicks the submit button
    Then the user should be successfully logged in to the application

    Examples: 
      | username | password    |
      | student  | Password123 |
      | staff    | Test@123    |
      | staff1   | Test@123    |
