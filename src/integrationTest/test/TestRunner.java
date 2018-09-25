package integrationTest.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/integrationTest/newResources/Feature",
		glue={"integrationTest.stepDefinition"},
		//dryRun=true,
		monochrome=true,
		tags={"@newtc1"}
		)

public class TestRunner {
	
		
}
