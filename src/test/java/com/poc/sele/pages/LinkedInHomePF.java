package com.poc.sele.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Using Page Factory
 */
public class LinkedInHomePF {

    WebDriver driver;

    public LinkedInHomePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='session_key']")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"session_password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section[1]/div[2]/form/button")
    WebElement submitBtn;

    public void goToHomePage() {
        driver.get("https://www.linkedin.com");
        driver.manage().window().maximize();
    }

    public void loginWithCreds(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void submitCreds() {
        submitBtn.click();
    }
}