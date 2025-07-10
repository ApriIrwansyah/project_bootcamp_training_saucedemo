package com.saucedemo.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SosialMediaPage {	
	
	WebDriver driver;

    @FindBy(xpath = "//li[@class='social_facebook']")
    WebElement facebookLink;

    @FindBy(xpath = "//li[@class='social_twitter']")
    WebElement twitterLink;

    @FindBy(xpath = "//li[@class='social_linkedin']")
    WebElement linkedinLink;
    
    public SosialMediaPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
	}

    public void clickFacebook() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(facebookLink)).click();
    	//        facebookLink.click();
    }

    public void clickTwitter() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
    	//        twitterLink.click();
    }

    public void clickLinkedIn() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(linkedinLink)).click();
    	//        linkedinLink.click();
    }
}
