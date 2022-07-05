package com.masarik.web;

import com.masarik.web.driverManager.WebDriverFactory;
import com.masarik.web.pageObjectManager.PageObjectManager;

/**
 * 
 * Test Context class holds all the objects states across different step
 * definitions classes.
 * 
 * It uses non-intrusive PicoContainer to share state between steps in a
 * scenario. Constructor is mandatory and requires an object that PicoContainer
 * can create and inject. PicoContainer is invisible, just be sure that the
 * constructors for the step classes require an instance of the same class.
 * 
 * @author michal masarik
 *
 */
public class TestContext {

	private WebDriverFactory webDriverFactory;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverFactory = new WebDriverFactory();
		pageObjectManager = new PageObjectManager(webDriverFactory.getDriver());
	}

	public WebDriverFactory getWebDriverFactory() {
		return webDriverFactory;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
