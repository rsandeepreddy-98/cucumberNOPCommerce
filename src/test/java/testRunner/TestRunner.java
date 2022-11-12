package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./Feature/Login.feature",
		glue = "stepDefination",
		monochrome = true,
		//plugin = {"pretty","html:test-output","json:target/cucumber.json"}
		plugin = {"pretty","html:target/cucumberreport.html"}
		
		)


public class TestRunner {

}
