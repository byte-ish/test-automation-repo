package com.poc.sele.stepdefinition;

import com.poc.sele.pages.LinkedInHome;
import com.poc.sele.pages.LinkedInHomePF;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class SeleStepDef implements En {

    WebDriver driver;
//    LinkedInHome linkedInHome;
    LinkedInHomePF linkedInHome;

    public SeleStepDef() {
        Given("^an invalid username and password$", () -> {
        });
        And("^user goes to the LinkedIn home page$", () -> {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            driver = new ChromeDriver();
//            linkedInHome = new LinkedInHome(driver);
            linkedInHome = new LinkedInHomePF(driver);
            linkedInHome.goToHomePage();

        });
        When("^user provides invalid credentials$", (DataTable table) -> {
            Map<String, String> credsMap = table.transpose().asMap(String.class, String.class);
            linkedInHome.loginWithCreds(credsMap.get("username"), credsMap.get("password"));
        });
        And("^then clicks on submit$", () -> {
            linkedInHome.submitCreds();
        });
    }
}
