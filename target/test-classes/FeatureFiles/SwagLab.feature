Feature: Test SwagLab application

  Scenario: Test for login functionality with valid credentials
    Given Open SwagLab application
    When User enter valid username "standard_user" and user enter valid password "secret_sauce"
    And User click on Login button
    Then User should be able to navigate Inventory page
