package com.masarik.web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

	@FindBy(id = "finish")
	private WebElement btnFinish;

	public CheckoutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void tapFinishButton() {
		btnFinish.click();
	}
}
