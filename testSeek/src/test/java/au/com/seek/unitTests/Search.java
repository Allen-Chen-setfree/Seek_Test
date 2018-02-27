package au.com.seek.unitTests;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
// @CucumberOptions(format = { "pretty", "html:target/cucumber-htmlreport",
// "json-pretty:target/cucumber-report.json" })

@CucumberOptions(features = ".\\src\\test\\java\\au\\com\\seek\\cukes\\features", glue = { "stepDefinition" })

public class Search {

}
