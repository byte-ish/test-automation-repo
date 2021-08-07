package com.poc.sele.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Using Page Object Model
 */
public class LinkedInHome {

    WebDriver driver;

    public LinkedInHome(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//*[@id='session_key']");
    By password = By.xpath("//*[@id=\"session_password\"]");
    By submitBtn = By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button");

    public void goToHomePage() {
        driver.get("https://www.linkedin.com");
        driver.manage().window().maximize();
    }

    public void loginWithCreds(String username, String password) {
        driver.findElement(this.username).sendKeys(username);
        driver.findElement(this.password).sendKeys(password);
    }

    public void submitCreds() {
        driver.findElement(submitBtn).click();
    }
}