package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.CheckoutPage;

import io.cucumber.java.en.When;

public class CheckoutPageStepDefinitions {

	private static TestContext testContext;
	private static CheckoutPage checkoutPage;

	public CheckoutPageStepDefinitions(TestContext context) {
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}

	@When("user inputs first name {string}")
	public void userInputsFirstName(String firstName) {
		checkoutPage.inputFirstName(firstName);
	}

	@When("user inputs last name {string}")
	public void userInputsLastName(String lastName) {
		checkoutPage.inputLastName(lastName);
	}

	@When("user inputs zip\\/postal code {string}")
	public void userInputsZipPostalCode(String code) {
		checkoutPage.inputPostalCode(code);
	}

	@When("user taps Continue button")
	public void userTapsContinueButton() {
		checkoutPage.tapContinueButton();
	}
}
