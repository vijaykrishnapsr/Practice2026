Feature: Login feature

Scenario: Validate login page with valid user name and password

Given User launch the application
When the user enters username and password
And the user clicks on the Sign in button
Then the user should be signed into the application successfully
