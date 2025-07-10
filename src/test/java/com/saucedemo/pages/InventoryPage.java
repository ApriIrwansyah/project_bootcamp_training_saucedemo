package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class InventoryPage {

	WebDriver driver;

	// Locators
	private By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By cartButton = By.id("shopping_cart_container");
	private By continueButton = By.xpath("//button[@id='continue-shopping']");
	private By addToCart1 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private By addToCart2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");

	@FindBy(xpath = "//span[@class='title']")
	WebElement productTitle;

	// Contructor
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

//	Method
	public void clickAddToCart() {
		driver.findElement(addToCart).click();
	}

	public void clickCartButton() {
		driver.findElement(cartButton).click();
	}

	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}

	public void clickAddToCart1() {
		driver.findElement(addToCart1).click();
	}

	public void clickAddToCart2() {
		driver.findElement(addToCart2).click();
	}

	public String getProductTitle() {
		return productTitle.getText();
	}
}
