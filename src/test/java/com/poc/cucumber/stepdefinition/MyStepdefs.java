package com.poc.cucumber.stepdefinition;

import io.cucumber.java8.En;


public class MyStepdefs implements En {
    public MyStepdefs() {
        Given("^the will to learn$", () -> {
            System.out.println("Print statement under given");
        });
    }
}
