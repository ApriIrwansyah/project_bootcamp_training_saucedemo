package com.saucedemo.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features 		= "./src/test/resources/features",
//    glue 			= "com.saucedemo.tests",
    glue 				= {"com.saucedemo.tests", "com.saucedemo.utils"},
//    tags 			= "@login or/and @checkout",
    tags			= "@sosialmedia or @inventory or @login",
//    tags				= "@checkoutSuccess", // @checkout  or @checkoutSuccess or @checkoutSuccessOutline
    plugin 			= {	"pretty", 
    					"html:target/reports/cucumber-reports.html",
    					"json:target/cucumber.json"},
    monochrome 		= true
)
public class TestRunner {}
