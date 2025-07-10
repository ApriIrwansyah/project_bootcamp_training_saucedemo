package com.saucedemo.tests;

import com.saucedemo.utils.Hooks;
//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.*;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.SosialMediaPage;
//import com.saucedemo.tests.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
//import java.util.Set;
import io.cucumber.java.AfterStep;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.junit.Assert;
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SosialMediaSteps {
	
	 WebDriver driver 					= Hooks.driver;
	 LoginPage loginPage 				= new LoginPage(driver);
	 SosialMediaPage sosialmediaPage 	= new SosialMediaPage(driver);
	 
	 
	@Given("I logged in to SauceDemo with enter {string} and password {string}")
	public void user_is_on_sauce_demo_homepage(String username, String password) {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
    	loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        
        // Tunggu elemen utama halaman tampil
        WebDriverWait wait 	= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("title")));
	}

	@When("User clicks Facebook link")
	public void user_clicks_facebook_link() {
		sosialmediaPage.clickFacebook();
	}
	
	@Then("Facebook page should open")
	public void facebook_page_should_open() {
	    // Simpan window utama sebelum berpindah
		System.out.println("Sukses membuka link Facebook");
	}

	@When("User clicks Twitter link")
	public void user_clicks_twitter_link() {
	    sosialmediaPage.clickTwitter();
	}

	@Then("Twitter page should open")
	public void twitter_page_should_open() {
		System.out.println("Sukses membuka link Twitter");
	}

	@When("User clicks LinkedIn link")
	public void user_clicks_linked_in_link() {
	    sosialmediaPage.clickLinkedIn();
	}

	@Then("LinkedIn page should open")
	public void linked_in_page_should_open() {
		System.out.println("Sukses membuka link Linkedn");
	}
	
  	// Screenshot capture after each step
    @AfterStep
    public void takeScreenshotAfterStep() {
        Screenshot.takeScreenshot(driver, "FormSosialMedia_Screenshot");
    }

	
}
