package com.saucedemo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features 		= "./src/test/resources/features",
//	    glue 			= "com.saucedemo.tests",
		glue 			= {"com.saucedemo.tests", "com.saucedemo.utils"},
	    plugin 			= {"pretty", "html:target/reports/cucumber-reports-JUnit.html"},
	    monochrome 		= true
)
public class JUnitRunner {}

