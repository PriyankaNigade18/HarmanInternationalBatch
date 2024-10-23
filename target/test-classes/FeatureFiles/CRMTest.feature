Feature: Test CRM application

  Background: 
    Given open Crm application with "https://automationplayground.com/crm/"

  Scenario: Test for signIn
    When User click on signIn link
    Then User should navigate to Login page

  Scenario: Test for Login with valid data
    When User navigated to login
    When User enter "test@gmailcom" email and "test123" password
    When User click on submit button
    Then User should able to navigate customers page
