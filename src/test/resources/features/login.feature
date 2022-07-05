@Login
@Functional
Feature: Login

  @Functional
  Scenario: Successful login of standard user
    Given homepage is opened in browser
    When user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user taps Login button
    Then user is logged in shop
    
  @Functional
  Scenario: Unsuccessful login of standard user
    Given homepage is opened in browser
    When user inputs username "standard_user"
    And user inputs password "bad_password"
    And user taps Login button
    Then user is not logged in shop
    And error message is displayed
