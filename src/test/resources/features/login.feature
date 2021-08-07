@selenium3
Feature: Logging into LinkedIn

  Scenario: Verify invalid login
    Given an invalid username and password
    And user goes to the LinkedIn home page
    When user provides invalid credentials
      | username      | password    |
      | ish@gmail.com | password123 |
    And then clicks on submit