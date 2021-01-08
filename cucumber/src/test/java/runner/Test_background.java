package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/java/features/background.feature"},
       glue= {"stepDefination"})
public class Test_background extends AbstractTestNGCucumberTests {

}
