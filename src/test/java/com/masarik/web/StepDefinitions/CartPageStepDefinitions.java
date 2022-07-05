package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.CartPage;

import io.cucumber.java.en.When;

public class CartPageStepDefinitions {

	private static TestContext testContext;
	private static CartPage cartPage;

	public CartPageStepDefinitions(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}

	@When("user taps Checkout button")
	public void userTapsCheckoutButton() {
		cartPage.tapCheckoutButton();
	}
}
