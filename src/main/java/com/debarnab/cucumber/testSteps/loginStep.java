package com.debarnab.cucumber.testSteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.landingPage;
import pages.signInPage;
import util.basicStep;
public class loginStep extends basicStep {

    private landingPage landingPageClass;
    public static WebDriver driver;
    private Object result;
    private signInPage loginPage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
        closeBrowser();
    }

    @Given("^I open Browser using \"([^\"]*)\"$")
    public void i_open_Browser_using(String browserType) throws Throwable {

       if(getProp().getProperty("username").equalsIgnoreCase("debarnab") &&
               getProp().getProperty("password").equalsIgnoreCase("debarnab")){
           driver = openBrowser(browserType);
           Assert.assertTrue(getDriver() != null);
       }
        else
           System.out.println("Incorrect validation.. aborting testing");

    }

    @When("^I navigate to the base Url$")
    public void i_navigate_to_base_url() throws Throwable {
        Assert.assertTrue("Unable to load url from prop file",getProperty("url") !=null);
        navigateToPage(getProperty("url"));
    }

    @And("^I click on Sigin Link$")
    public void i_click_on_signin_link(){
        landingPageClass = new landingPage(driver);
        result = landingPageClass.clickSignInLink();
        Assert.assertEquals(result,"Sign In Link Clicked");
        loginPage = new signInPage(driver);
    }

    @And("^I enter userName and Password as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_fill_in_with(String username, String password) throws Throwable {
        result= loginPage.doLogin(username, password);
        Assert.assertEquals(result,"Able to click Sigin Button with credentials properly");
    }

    @Then("^I should see logged in as \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        result = loginPage.verifyPostLoginElements(arg1);
        Assert.assertEquals(result,"Home Page Displayed Properly");
    }
}
