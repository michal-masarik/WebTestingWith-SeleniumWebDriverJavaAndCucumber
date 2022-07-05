package com.masarik.web.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.masarik.web.pageObjects.CartPage;
import com.masarik.web.pageObjects.CheckoutCompletePage;
import com.masarik.web.pageObjects.CheckoutOverviewPage;
import com.masarik.web.pageObjects.CheckoutPage;
import com.masarik.web.pageObjects.LoginPage;
import com.masarik.web.pageObjects.ProductListingPage;

/**
 * Page Object Manager is responsible for creating Page Objects. It also assures
 * that the same Page Objects are not created multiple times.
 * 
 * @author michal masarik
 *
 */
public class PageObjectManager {

	private WebDriver driver;

	private LoginPage loginPage;
	private ProductListingPage productListingPage;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	private CheckoutOverviewPage checkoutOverviewPage;
	private CheckoutCompletePage checkoutCompletePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public ProductListingPage getProductListingPage() {
		return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
	}

	public CartPage getCartPage() {
		return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	}

	public CheckoutPage getCheckoutPage() {
		return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	}

	public CheckoutOverviewPage getCheckoutOverviewPage() {
		return (checkoutOverviewPage == null) ? checkoutOverviewPage = new CheckoutOverviewPage(driver)
				: checkoutOverviewPage;
	}

	public CheckoutCompletePage getCheckoutCompletePage() {
		return (checkoutCompletePage == null) ? checkoutCompletePage = new CheckoutCompletePage(driver)
				: checkoutCompletePage;
	}

}
