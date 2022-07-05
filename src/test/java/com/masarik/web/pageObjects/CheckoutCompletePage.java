package com.masarik.web.pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

	@FindBy(className = "header_secondary_container")
	private WebElement headerSecondaryContainer;
	
	@FindBy(className = "complete-header")
	private WebElement completeHeader;

	private final String EXPECTED_CHECKOUT_COMPLETED_TEXT = "CHECKOUT: COMPLETE!";
	private final String EXPECTED_THANK_YOU_TEXT = "THANK YOU FOR YOUR ORDER";

	public CheckoutCompletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyCheckoutIsCompleted() {
		String actualText = headerSecondaryContainer.getText();
		assertTrue("Text not found: " + EXPECTED_CHECKOUT_COMPLETED_TEXT,
				actualText.contains(EXPECTED_CHECKOUT_COMPLETED_TEXT));
	}

	public void verifyThankYouIsDisplayed() {
		String actualText = completeHeader.getText();
		assertTrue("Text not found: " + EXPECTED_THANK_YOU_TEXT,
				actualText.contains(EXPECTED_THANK_YOU_TEXT));
	}
}
