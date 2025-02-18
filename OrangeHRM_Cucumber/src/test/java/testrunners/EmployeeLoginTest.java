package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "FeatureFiles/empLogin.feature", glue = "stepdefinitions", dryRun = false,

plugin = {"pretty", "html:Test Reports/employeereg.html"}
		)
public class EmployeeLoginTest extends AbstractTestNGCucumberTests{

}
