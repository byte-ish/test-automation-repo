package com.poc.sele;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"},
        features = {"src/test/resources/features"},
        glue = {"com.poc.sele.stepdefinition"},
        tags = "@selenium3",
        stepNotifications = true)
public class TestRunner {
}
