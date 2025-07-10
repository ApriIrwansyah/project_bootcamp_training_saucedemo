package com.saucedemo.tests;

import com.saucedemo.utils.Hooks;
import com.saucedemo.pages.LoginPage;
//import com.saucedemo.tests.Screenshot;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import io.cucumber.java.AfterStep;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;

public class LoginSteps {
    WebDriver driver 	= Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
//    Screenshot screenshot = new Screenshot();
    
      @Given("User is on SauceDemo login page")
	  public void user_is_on_sauce_demo_login_page() {
    	  driver.get("https://www.saucedemo.com/");
	  }
      
	  @When("User enters username {string} and password {string}")
	  public void user_enters_username_and_password(String username, String password) {
		  loginPage.enterUsername(username);
          loginPage.enterPassword(password);
	  }

	  @When("User clicks on login button")
	  public void user_clicks_on_login_button() {
		  loginPage.clickLogin();
	  }

	  @Then("User should be redirected to homepage")
	  public void user_should_be_redirected_to_homepage() {
		  Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
	  }

	  @Then("User should see an error message")
	  public void user_should_see_an_error_message() {
		  Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"));
	  }

	  @When("User enters username {string}  and password {string} outline")
	  public void user_enters_username_and_password_outline(String username_outline, String password_outline) {
		  loginPage.enterUsername(username_outline);
          loginPage.enterPassword(password_outline);
	  }

	  @Then("I should be logged in successfully")
	  public void i_should_be_logged_in_successfully() {		  System.out.println("Successfiull");
		  //		  Assert.assertTrue(driver.geturrentUrl().contains("inventory.html"));
	  }
	  
	  	// Screenshot capture after each step
	    @AfterStep
	    public void takeScreenshotAfterStep() {
	        Screenshot.takeScreenshot(driver, "FormLogin_Screenshot");
	    }
	  
////	 Screenshot Capture After Step otomatis
//	    @AfterStep
//	    public void takeScreenshot() {
//	        TakesScreenshot ts = (TakesScreenshot) driver;
//	        File source = ts.getScreenshotAs(OutputType.FILE);
////	          String filePath = "target/screenshots/" + scenarioName + "_" + timestamp + ".png";
//	        String filePath = "target/screenshots/login" + System.currentTimeMillis() + ".png";
//
//	        try {
//	            FileUtils.copyFile(source, new File(filePath));
//	            System.out.println("Screenshot captured: " + filePath);
//	        } catch (IOException e) {
//	            System.out.println("Failed to capture screenshot: " + e.getMessage());
//	        }
//	    }

}

//eclipse-workspace\project_bootcamp_training_saucedemo
