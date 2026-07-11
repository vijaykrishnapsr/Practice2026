@regression
Feature: Validating login feature

  Background: 
    Given User launches the application
    And user clicks on Sign in button

  @smoke @sanity
  Scenario: Validating login with valid credentials
    Given the user is on the login screen
    When the user enters username as "student" and Password as "Password123"
    And the user clicks on Login CTA
    Then the user should be successfully logged in

  @sanity
  Scenario: Validating login with invalid credentials
    Given the user is on the login screen
    When the user enters username as "staff" and Password as "Password1234"
    And the user clicks on Login CTA
    Then the user should see an Error message
