package com.debarnab.cucumber.testSteps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import pages.landingPage;
import pages.signInPage;
import pages.womanPage;
import util.basicStep;

import java.util.ArrayList;
import java.util.List;

public class womanPageStep extends basicStep {

    private landingPage landingPageClass;
    private WebDriver driver = loginStep.driver;
    private Object result;
    private signInPage loginPage;
    private homePage homePageElement;
    private womanPage womanPageElement;

    @Then("^In the Woman Page I can see the following under \"([^\"]*)\":$")
    public void in_the_Woman_Page_I_can_see_the_following(String section,DataTable pageElements) throws Throwable {
        womanPageElement = new womanPage(loginStep.driver);
        List<List<String>> data = pageElements.raw();
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1;i<data.size();i++){
            list.add(data.get(i).get(0));
        }
       result= womanPageElement.validateSectionsName(section,list);
        Assert.assertEquals("Section in Woman Page validated successfully.",result);
    }
}
