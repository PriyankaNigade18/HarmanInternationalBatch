@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @homePage @Regression @ignore
  Scenario: Test for home page title
    When User get the home page title
    Then Title should match to homepage title

  @sellPage @Regression
  Scenario: Test for Sell page title
    When User open Sell page
    When User get the title of Sell page
    Then Sell page title should match

  @mobilePage @Regression @ignore
  Scenario: Test for Mobiles page title
    When User open Mobile page
    When User get the title of mobile page
    Then Mobile page title should match
