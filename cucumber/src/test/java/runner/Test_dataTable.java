package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/DataTable.feature", 
                 glue={"stepDefination","hook"})
public class Test_dataTable extends AbstractTestNGCucumberTests{

}
