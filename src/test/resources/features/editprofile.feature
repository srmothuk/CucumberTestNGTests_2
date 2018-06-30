Feature: Edit Profile

@regressiontest
  Scenario: Edit profile
    Given I am on the registered user home page
    When I enter personal details and enter submit button
    Then logged in use should be taken to the home page