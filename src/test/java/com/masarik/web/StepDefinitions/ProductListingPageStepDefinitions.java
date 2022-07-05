package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.ProductListingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductListingPageStepDefinitions {

	private static TestContext testContext;
	private static ProductListingPage productListingPage;

	public ProductListingPageStepDefinitions(TestContext context) {
		testContext = context;
		productListingPage = testContext.getPageObjectManager().getProductListingPage();
	}

	@When("user sets filter to {string}")
	public void userSetsFilterTo(String filter) {
		productListingPage.setSortFilterToValue(filter);
	}

	@When("user adds first item to cart")
	public void userAddsFirstItemToCart() {
		productListingPage.addFirstItemToCart();
	}

	@When("user taps shopping cart")
	public void userTapsShoppingCart() {
		productListingPage.tapShoppingCart();
	}

	@Then("user is logged in shop")
	public void userIsLoggedInShop() {
		productListingPage.verifyUserIsLoggedIn();
	}
}
