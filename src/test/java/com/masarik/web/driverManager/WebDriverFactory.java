package com.masarik.web.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.masarik.web.TestContext;
import com.masarik.web.dataProvider.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Factory provides WebDriver to other objects. Typical consumer of driver
 * is {@link TestContext}
 * 
 * Type of driver is dependent on type of browser, which can configured in
 * src/test/resources/test.properties.
 * 
 * At the same file also boolean isWindowMaximized is defined. If true then
 * window is maximized just after driver initialization.
 * 
 * @author michal masarik
 *
 */
public class WebDriverFactory {

	private WebDriver driver;
	private static DriverType driverType;

	public WebDriverFactory() {
		driverType = DriverType.valueOf(ConfigReader.getInstance().getProperty("browser"));
	}

	/**
	 * Provides initiated driver according to browser parameter in test.properties
	 * 
	 * @return initiated WebDriver
	 */
	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	/**
	 * Close and quit active browser.
	 */
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

	private WebDriver createDriver() {
		switch (driverType) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = (WebDriver) new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = (WebDriver) new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = (WebDriver) new ChromeDriver();
			break;
		}

		Boolean isWindowMaximized = Boolean.valueOf(ConfigReader.getInstance().getProperty("windowMaximize"));
		System.out.println("isMaximized=" + isWindowMaximized);
		if (isWindowMaximized) {
			driver.manage().window().maximize();
		}

		return driver;
	}
}
