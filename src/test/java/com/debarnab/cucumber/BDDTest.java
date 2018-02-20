package com.debarnab.cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resource//"
        , glue = {"com.debarnab.cucumber.testSteps"}
        , format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
        , tags = {"~@Ignore"}
        // , tags = {"@FilterOfSearchResults"}
)
public class BDDTest {
}
