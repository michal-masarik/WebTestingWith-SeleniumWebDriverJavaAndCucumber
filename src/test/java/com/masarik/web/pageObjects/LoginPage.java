package com.masarik.web.pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.masarik.web.dataProvider.ConfigReader;

public class LoginPage {

	private WebDriver driver;

	@FindBy(className = "login_logo")
	private WebElement loginLogo;

	@FindBy(id = "user-name")
	private WebElement txtInputUserName;

	@FindBy(id = "password")
	private WebElement txtInputPassword;

	@FindBy(id = "login-button")
	private WebElement btnLogin;

	@FindBy(className = "error-message-container")
	private WebElement errorMessageContainer;

	private final String HOMEPAGE = ConfigReader.getInstance().getProperty("homepageUrl");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void inputUserName(String userName) {
		txtInputUserName.sendKeys(userName);
	}

	public void inputPassword(String password) {
		txtInputPassword.sendKeys(password);
	}

	public void tapLoginButton() {
		btnLogin.click();
	}

	public void openLoginPage() {
		driver.get(HOMEPAGE);
	}

	public void verifyLoginPage() {
		assertTrue(loginLogo.isDisplayed());
	}

	public void loginStandarduser() {
		inputUserName("standard_user");
		inputPassword("secret_sauce");
		tapLoginButton();
	}

	public void verifyErrorMessageIsDisplayed() {
		assertTrue(errorMessageContainer.isDisplayed());
	}
}
