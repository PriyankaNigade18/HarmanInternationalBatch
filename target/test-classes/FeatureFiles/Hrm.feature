Feature: Test Oragehrm data driven

  Scenario Outline: Test Hrm Login with combinational data
    Given Open Hrm application
    When User enter "<username>" and "<password>" into hrm login page
    When user click on login button of hrm page
    Then As per the valid data set user should able to navigate dashboard page

    #data set
    Examples: 
      | username | password |
      | Admin    | admin123 |
      | chetan   | test123  |
      | Admin    | admin123 |
      | smita    | test124  |
