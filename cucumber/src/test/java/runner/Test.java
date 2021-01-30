package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/java/features/file2.feature"},glue= {"stepDefination","hook"},
      // tags={"~@Smoke"}//not annotations,it will skip that particular tag
      // tags= {"@Smoke", "@Regression"},//and annotations,excute all tags with smoke & regression
         tags= {"@Smoke, @Regression"},//or annotations,excute all tags with smoke or regression
       monochrome=true)

public class Test extends AbstractTestNGCucumberTests{

	
}
