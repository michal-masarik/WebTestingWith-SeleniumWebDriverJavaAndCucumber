package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.CheckoutOverviewPage;

import io.cucumber.java.en.When;

public class CheckoutOverviewPageStepDefinitions {

	private static TestContext testContext;
	private static CheckoutOverviewPage checkoutOverviewPage;

	public CheckoutOverviewPageStepDefinitions(TestContext context) {
		testContext = context;
		checkoutOverviewPage = testContext.getPageObjectManager().getCheckoutOverviewPage();
	}

	@When("user taps Finish button")
	public void userTapsFinishButton() {
		checkoutOverviewPage.tapFinishButton();
	}
}
