package com.masarik.web.pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage {

	@FindBy(className = "product_sort_container")
	private WebElement productSortFilter;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement firstProductInStore;

	@FindBy(id = "shopping_cart_container")
	private WebElement shoppingCart;

	@FindBy(id = "react-burger-menu-btn")
	private WebElement btnBurgerMenu;

	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSortFilterToValue(String value) {
		Select drpFilter = new Select(productSortFilter);
		drpFilter.selectByVisibleText(value);
	}

	public void addFirstItemToCart() {
		firstProductInStore.click();
	}

	public void tapShoppingCart() {
		shoppingCart.click();
	}

	public void verifyUserIsLoggedIn() {
		assertTrue("btnBurgerMenu is not displayed: ", btnBurgerMenu.isDisplayed());
	}
}
