package com.debarnab.cucumber.testSteps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import pages.landingPage;
import pages.signInPage;
import util.basicStep;

public class homePageStep extends basicStep {

    private landingPage landingPageClass;
    private WebDriver driver = loginStep.driver;
    private Object result;
    private signInPage loginPage;
    private homePage homePageElement;

//    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot...
//            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
//        }
//        closeBrowser();
//    }

    @And("^In the Home Page I click on \"([^\"]*)\" section$")
    public void in_the_Home_Page_I_click_on(String clickElement) throws Throwable {
        if(homePageElement==null){
            homePageElement = new homePage(driver);
        }

        if(clickElement.equalsIgnoreCase("Woman")){
           result= homePageElement.clickWomanSectionInHomePage();
        }

        Assert.assertEquals("Clicked on the Woman Link from Home Page",result);
    }
}
