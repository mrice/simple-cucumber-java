package com.michaelrice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringEchoMachineDefinitions {

    StringEchoMachine machine = new StringEchoMachine();
    String originalString = null;
    String actualString = null;
    boolean checkExecuted = false;

    @Given("^I have a string such as \"(.*?)\"$")
    public void have_a_string(String string) {
        assertNotNull(string);
        originalString = string;
    }
    @When("^I check the string$")
    public void check_the_strings() {
        checkExecuted = true;
        actualString = machine.echo(originalString);
    }
    @Then("^the string should be \"(.*?)\"$")
    public void the_string_should_be(String string) {
        assertNotNull(string);
        assertNotNull(actualString);
        assertEquals(actualString, string);
    }
}
