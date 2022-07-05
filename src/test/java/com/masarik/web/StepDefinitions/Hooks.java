package com.masarik.web.StepDefinitions;

import com.masarik.web.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * This class provides Cucumber style methods, which are executed during the
 * test run before and after each scenario
 * 
 * @author michal masarik
 *
 */
public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	/**
	 * This method is executed before each scenario.
	 */
	@Before
	public void BeforeSteps() {
	}

	/**
	 * This method is executed after each scenario.
	 */
	@After
	public void AfterSteps() {
		testContext.getWebDriverFactory().closeDriver();
	}
}
