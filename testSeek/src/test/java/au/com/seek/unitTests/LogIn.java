package au.com.seek.unitTests;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/au/com/seek/cukes/features/LogIn.feature", glue = {
		"au.com.seek.cukes.steps" })

public class LogIn {

}

