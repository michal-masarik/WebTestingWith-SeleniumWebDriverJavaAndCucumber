package com.masarik.web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	@FindBy(id = "first-name")
	private WebElement txtInputFirstName;

	@FindBy(id = "last-name")
	private WebElement txtInputLastName;

	@FindBy(id = "postal-code")
	private WebElement txtInputPostalCode;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void inputFirstName(String firstName) {
		txtInputFirstName.sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		txtInputLastName.sendKeys(lastName);
	}

	public void inputPostalCode(String postalCode) {
		txtInputPostalCode.sendKeys(postalCode);
	}

	public void tapContinueButton() {
		btnContinue.click();
	}

	public void inputAllFieldsAndContinue() {
		inputFirstName("John");
		inputLastName("Doe");
		inputPostalCode("75624");
		tapContinueButton();
	}
}
