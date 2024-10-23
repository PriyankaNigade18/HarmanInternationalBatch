@All
Feature: Test OpenCart application

	@Register @FunctionalTest #tags in cucumber
  Scenario: Test register feature of OpenCart with valid data
    Given Open opencart Register page
    When User enters required entries
      | fname    | lname  | email                | telephone | password | cpassword |
      | Priyanka | Nigade | priyanka24@gmail.com | 876554443 | test123  | test123   |
    When user click on yes redio button
    When user check the privacy policy checkbox
    When User click on Continue button
    Then User should be register into application

	@Login @functionalTest
  Scenario: Test Login functionality for register user
    Given Open login page
    When user enter valid credentials
      | email                | psw |
      | priyanka24@gmail.com | test123  |
     And user click on login button of opencart
     Then user should be login into app
     
