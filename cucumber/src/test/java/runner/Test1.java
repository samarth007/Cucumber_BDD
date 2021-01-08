package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features={"src/test/java/features"}, glue={"stepDefination"},
                      plugin= {"pretty",
                    		  "html:target/cucumber-reports/cucumber-pretty",
                    		  "json:target/cucumber-report/CucumberTestReport.json"
                      })
public class Test1 extends AbstractTestNGCucumberTests{

	
	
	
	
}
