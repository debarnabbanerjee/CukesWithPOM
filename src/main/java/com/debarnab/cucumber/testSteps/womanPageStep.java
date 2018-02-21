package com.debarnab.cucumber.testSteps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import pages.landingPage;
import pages.signInPage;
import util.basicStep;

public class womanPageStep extends basicStep {

    private landingPage landingPageClass;
    private WebDriver driver = loginStep.driver;
    private Object result;
    private signInPage loginPage;
    private homePage homePageElement;

    @Then("^In the Woman Page I can see the following :$")
    public void in_the_Woman_Page_I_can_see_the_following(DataTable arg1) throws Throwable {

    }


}
