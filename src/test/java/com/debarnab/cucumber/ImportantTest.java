package com.debarnab.cucumber;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features"
        , glue = {"com.debarnab.cucumber.testSteps"}
        , format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
        , tags = {"@important"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)
public class ImportantTest {

}
