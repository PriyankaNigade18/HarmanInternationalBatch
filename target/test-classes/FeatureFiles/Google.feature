Feature: Test google application

Background:
 Given Open Google application

  Scenario: Test for title of application
   # Given Open Google application
    When I get the current application title
    Then Title should match with Google

  Scenario: Test for search functionality with valid keyword
    #Given Open Google application
    When I enter valid keyword "Java" into serchbox
    Then I should get valid search result
