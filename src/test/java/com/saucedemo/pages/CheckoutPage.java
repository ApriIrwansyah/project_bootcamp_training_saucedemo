package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage {
	
	WebDriver driver;
	
	//	Locators
	private By addToCart		= By.id("add-to-cart-sauce-labs-backpack");
    private By cartButton 		= By.id("shopping_cart_container");
    private By checkoutButton 	= By.id("checkout");
    private By firstNameField 	= By.id("first-name");
    private By lastNameField 	= By.id("last-name");
    private By postalCodeField 	= By.id("postal-code");
    private By continueButton 	= By.id("continue");
    private By finishButton 	= By.id("finish");
    
    @FindBy(xpath= "//h2[normalize-space()='Thank you for your order!']")
    WebElement successfull;
    
    //    Contructor
    public CheckoutPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    //    Methods
    public void clickAddToCart() {
    	driver.findElement(addToCart).click();
    }
    
    public void clickGoToCart() {
    	driver.findElement(cartButton).click();
    }
    
    public void clickProceedToCheckout() {
    	driver.findElement(checkoutButton).click();
    }
    
    public void enterCheckoutDetails(String firstName, String lastName, String postalCode) {
    	driver.findElement(firstNameField).sendKeys(firstName);
    	driver.findElement(lastNameField).sendKeys(lastName);
    	driver.findElement(postalCodeField).sendKeys(postalCode);
    	driver.findElement(continueButton).click();
    }
    
    public void completedCheckout() {
    	driver.findElement(finishButton).click();
    }
    
    public String viewSuccessfull() {
    	return successfull.getText();    
    }
	
}
