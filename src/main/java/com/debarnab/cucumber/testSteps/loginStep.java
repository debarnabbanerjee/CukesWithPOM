package com.debarnab.cucumber.testSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Debarnab on 2/20/2018.
 */
public class loginStep {
    @Given("^I am not authenticated$")
    public void i_am_not_authenticated() throws Throwable {
        System.out.println("I am not authenticated");
    }

    @When("^I go to Login page$")
    public void i_go_to_Login_page() throws Throwable {
    }

    @When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {

    }

    @When("^I press \"([^\"]*)\"$")
    public void i_press(String arg1) throws Throwable {

    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {

    }


}
