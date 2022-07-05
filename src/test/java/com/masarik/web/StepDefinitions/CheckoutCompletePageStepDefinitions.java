package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.CheckoutCompletePage;

import io.cucumber.java.en.Then;

public class CheckoutCompletePageStepDefinitions {

	private static TestContext testContext;
	private static CheckoutCompletePage checkoutCompletePage;

	public CheckoutCompletePageStepDefinitions(TestContext context) {
		testContext = context;
		checkoutCompletePage = testContext.getPageObjectManager().getCheckoutCompletePage();
	}

	@Then("checkout is completed")
	public void checkoutIsCompleted() {
		checkoutCompletePage.verifyCheckoutIsCompleted();
	}

	@Then("Thank you for your order is displayed")
	public void thankYouForYourOrderIsDisplayed() {
		checkoutCompletePage.verifyThankYouIsDisplayed();
	}
}
