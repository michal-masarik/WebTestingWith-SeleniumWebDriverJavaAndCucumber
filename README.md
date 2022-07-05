# Web Testing with Selenium WebDriver, Cucumber and Java

This is a proof of concept of test framework for simple [web shop application](https://www.saucedemo.com/). 

Focus is on web browser testing with following technologies:

* Selenium WebDriver
* Cucumber
* Java
* Maven
* Page Object Design Pattern

## How to run the tests

```shell
mvn clean test
```

## Test reports

After test run, you can find Cucumber test report in console.

In console you can also find a link to the test report, which is published online during each run. Eg.:

```
View your Cucumber Report at:                                            
 https://reports.cucumber.io/reports/aa6b836e-9437-4561-8ce7-514c62f3b212 
  
```

# Implementation Notes

* My goal wasn't extensively test the application with great number of tests, but provide a good, robust and easily expandable test framework.
* Framework is using BDD Cucumber style with high definition of scenarios in Gherkin language.
* Step Definitions are separated from Gherkin and also from Page Objects.
* Page Object Design Pattern is implemented using Selenium PageFactory.
* Test Context between scenarios is shared through PicoContainer.
* There is implemented ConfigReader, which reads runtime configuration from test.properties. 
* In test.properties can be for example configured browser on which are tests run (Chrome, Firefox, Edge...).
