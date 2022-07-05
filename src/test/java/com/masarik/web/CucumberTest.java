package com.masarik.web;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Entry point for Cucumber tests
 * 
 * @author michal masarik
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/features")
public class CucumberTest {
}