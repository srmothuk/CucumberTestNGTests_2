Feature: Login


  Scenario: Login with valid credentials
    Given I am on the non registered user home page
    When I enter user name and password details
    Then non registered user should be taken to the logged in home page