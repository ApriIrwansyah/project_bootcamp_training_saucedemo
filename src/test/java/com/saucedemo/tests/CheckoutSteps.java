package com.saucedemo.tests;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.tests.Screenshot;
import com.saucedemo.utils.Hooks;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class CheckoutSteps {
	
    WebDriver driver 			= Hooks.driver;
    LoginPage loginPage 		= new LoginPage(driver);
    CheckoutPage checkoutPage 	= new CheckoutPage(driver);

    @Given("I am logged in to SauceDemo with enter {string} and password {string}")
    public void i_am_logged_in_to_sauce_demo_with_enter_and_password(String username, String password) {
    	driver.get("https://www.saucedemo.com/");
    	loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @When("I add a product to cart and proceed to checkout")
    public void i_add_a_product_to_cart_and_proceed_to_checkout() {
    	checkoutPage.clickAddToCart();
    	checkoutPage.clickGoToCart();
    	checkoutPage.clickProceedToCheckout();
    }
    
    @When("I enter checkout details {string} {string} {string}")
    public void i_enter_checkout_details(String firstName, String lastName, String postalCode) {
    	checkoutPage.enterCheckoutDetails(firstName, lastName, postalCode);
    }

    @Then("I should complete the purchase successfully")
    public void i_should_complete_the_purchase_successfully() {
    	checkoutPage.completedCheckout();
    }

    @Then("I should complete the purchase successfully and displays a message")
    public void i_should_complete_the_purchase_successfully_and_displays_a_message() {
    	System.out.println("Thank you for your order!");
    }
    
  	// Screenshot capture after each step
    @AfterStep
    public void takeScreenshotAfterStep() {
        Screenshot.takeScreenshot(driver, "FormCheckout_Screenshot");
    }
    
}
