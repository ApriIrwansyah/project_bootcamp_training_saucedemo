package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    
    // Locator
     private By usernameField 	= By.id("user-name");
     private By passwordField 	= By.id("password");
     private By loginButton 			= By.id("login-button");
    
    //    Locators
//    @FindBy(id = "user-name")
//    WebElement usernameField;
//
//    @FindBy(id = "password")
//    WebElement passwordField;
//
//    @FindBy(id = "login-button")
//    WebElement loginButton;

    @FindBy(css = ".error-message-container")
    WebElement errorMessage;
    
    //    Contructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    
    //    Methods

//    public void enterUsername(String username) {
//        usernameField.sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        passwordField.sendKeys(password);
//    }
//
//    public void clickLogin() {
//        loginButton.click();
//    }

}

