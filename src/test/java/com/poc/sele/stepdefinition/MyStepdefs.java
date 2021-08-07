package com.poc.sele.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;


public class MyStepdefs implements En {

    public MyStepdefs() {

        Before(() -> {
            System.out.println("Run Before Every Scenario independent of Background");
        });

        Given("^the will to learn$", () -> {
            System.out.println("Print statement under given");
        });
        When("^we pass a value (\\d+)$", (Integer arg0) -> {
            System.out.println("And we passed an integer ".concat(arg0.toString()));
        });
        Given("^a set of data with (.*) and (\\d+)$", (String name, Integer age) -> {
        });

        Given("^some data details$", (DataTable table) -> {
            System.out.println(table);
        });
        Given("^perform some pre-req steps common to all scenarios$", () -> {
        });
        And("^lets be happy that we are alive$", () -> {
            System.out.println("Happy to be alive");
        });
        Given("^do nothing$", () -> {
            System.out.println("Doing nothing");
        });


    }
}
