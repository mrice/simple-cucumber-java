package com.michaelrice;

import com.michaelrice.IntegerEchoMachine;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mrice on 7/29/14.
 */
public class IntegerEchoMachineDefinitions {

    IntegerEchoMachine machine = new IntegerEchoMachine();
    int originalInt = 0;
    int actualInt = 0;
    boolean checkExecuted = false;

    @Given("^I have an integer (\\d+)$")
    public void i_have_an_integer(int integer) throws Throwable {
        originalInt = integer;
    }

    @When("^I check the integer$")
    public void i_check_the_integer() throws Throwable {
        checkExecuted = true;
        actualInt = machine.echo(originalInt);
    }

    @Then("^the integer should be (\\d+)$")
    public void the_integer_should_be(int expected) throws Throwable {
        assertTrue(checkExecuted);
        assertEquals(originalInt, actualInt);
    }
}
