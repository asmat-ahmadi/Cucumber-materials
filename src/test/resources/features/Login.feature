Feature: Login scenarios

  Scenario: Valid admin login
    Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee List option
    When user enters employee id
    And user clicks on search button
    Then user should be able to see emploee details


