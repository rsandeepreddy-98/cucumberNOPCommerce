package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Feature",
		glue = "stepDefination",
		monochrome = true,
		plugin = {"pretty","html:test-output","json:target/cucumber.json"}
		)


public class TestRunner {

}
