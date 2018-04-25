package com.debarnab.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = "src//test//resources//"
        , glue = {"com.debarnab.cucumber.testSteps"}
        , format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
        , tags = {"~@important"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)
public class BDDTestNgTest extends AbstractTestNGCucumberTests{




}
