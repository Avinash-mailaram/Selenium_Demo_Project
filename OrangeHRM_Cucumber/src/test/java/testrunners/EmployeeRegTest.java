package testrunners;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//To run with Cucumber TestNG, we have to select the Cucucmber TestNg in cucumber options
@CucumberOptions(features= "FeatureFiles/employeereg.feature", glue = "stepdefinitions", dryRun = false,

plugin = {"pretty", "html:Test Reports/employeereg.html"}) 
public class EmployeeRegTest extends AbstractTestNGCucumberTests{

}
