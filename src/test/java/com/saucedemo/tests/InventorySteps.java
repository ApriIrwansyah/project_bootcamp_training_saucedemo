package com.saucedemo.tests;

import com.saucedemo.utils.Hooks;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.InventoryPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.AfterStep;

public class InventorySteps {
	
	WebDriver driver 		= Hooks.driver;
	LoginPage loginPage		= new LoginPage(driver);
	InventoryPage inventoryPage		= new InventoryPage(driver);
	
	@Given("I'am logged in to SauceDemo with enter {string} and password {string}")
	public void i_am_logged_in_to_sauce_demo_with_enter_and_password(String username, String password) {
		driver.get("https://www.saucedemo.com/");
    	loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
	}

	@When("User adds to cart")
	public void user_adds_to_cart() {
		inventoryPage.clickAddToCart();
	}

	@When("User views product in cart")
	public void user_views_product_in_cart_and_continues() {
	   inventoryPage.clickCartButton();
	}

	@Then("User successfully added product from Products page")
	public void user_successfully_added_product_from_products_page() {
		System.out.println("Successfull");
	}
	
  	// Tangkapan layar setelah setiap langkah
    @AfterStep
    public void takeScreenshotAfterStep() {
        Screenshot.takeScreenshot(driver, "FormInventory_Screenshot");
    }
  

	
	
}
