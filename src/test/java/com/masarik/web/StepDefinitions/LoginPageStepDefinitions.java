package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;
import com.masarik.web.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {

	private static TestContext testContext;
	private static LoginPage loginPage;

	public LoginPageStepDefinitions(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}

	@Given("homepage is opened in browser")
	public void homepageIsOpenedInBrowser() {
		loginPage.openLoginPage();
		loginPage.verifyLoginPage();
	}

	@When("user inputs username {string}")
	public void userInputsUsername(String username) {
		loginPage.inputUserName(username);
	}

	@When("user inputs password {string}")
	public void userInputsPassword(String password) {
		loginPage.inputPassword(password);
	}

	@When("user taps Login button")
	public void userTapsLoginButton() {
		loginPage.tapLoginButton();
	}

	@Then("user is not logged in shop")
	public void userIsNotLoggedInShop() {
		loginPage.verifyLoginPage();
	}

	@Then("error message is displayed")
	public void errorMessageIsDisplayed() {
		loginPage.verifyErrorMessageIsDisplayed();
	}
}
