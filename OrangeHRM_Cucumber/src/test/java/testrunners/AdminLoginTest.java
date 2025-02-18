package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

//Using cucumber TestNG, we run this program
(features= "FeatureFiles/adminlogin.feature", glue= "stepdefinitions", dryRun = false, 
plugin= {"pretty","html:TestReports/AdminloginTest.html"})
public class AdminLoginTest extends AbstractTestNGCucumberTests{

	
}
