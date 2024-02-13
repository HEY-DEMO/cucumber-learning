Feature: User Login
  I want to be able to login to the website

  Scenario: Successful Login
    Given I am on the login page
    When I enter valid credentials
    And click on the login button
    Then I should be logged in successfully
