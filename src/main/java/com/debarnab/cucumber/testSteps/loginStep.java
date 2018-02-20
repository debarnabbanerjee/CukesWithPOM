package com.debarnab.cucumber.testSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import util.basicStep;

/**
 * Created by Debarnab on 2/20/2018.
 */
public class loginStep extends basicStep {

    @Given("^I open Browser using \"([^\"]*)\"$")
    public void i_open_Browser_using(String browserType) throws Throwable {
        openBrowser(browserType);
        Assert.assertTrue(getDriver() != null);
    }

    @When("^I go to Login page$")
    public void i_go_to_Login_page() throws Throwable {
        Assert.assertTrue("Unable to load url from prop file",getProperty("url") instanceof String);
        navigateToPage(getProperty("url"));
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

    @And("^I exit browser$")
    public void i_exit_browser() throws Throwable {
        closeBrowser();
    }


}
