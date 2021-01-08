package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features={"src/test/java/features"},glue= {"stepDefination","hook"},tags="@Regression")
public class Test extends AbstractTestNGCucumberTests {

	
}
