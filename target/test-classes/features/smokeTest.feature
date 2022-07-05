@Functional 
@Smoke
Feature: Smoke test
Description: The purpose of this feature is to test End2End integration

	@Functional 
	@Smoke
  Scenario: Customer place an order by purchasing a cheapest item from the shop
    Given homepage is opened in browser
    When user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user taps Login button
    And user sets filter to "Price (low to high)"
    And user adds first item to cart
    And user taps shopping cart
    And user taps Checkout button
    And user inputs first name "John"
    And user inputs last name "Doe"
    And user inputs zip/postal code "75624"
    And user taps Continue button
    And user taps Finish button
    Then checkout is completed
    And Thank you for your order is displayed
    