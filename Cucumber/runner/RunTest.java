package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = {"src/test/java/features"}, 
				glue= {"steps"}, 
				monochrome = true,
				publish = true,
				//tags="@functional" //to execute all the @functional scenarios
				//tags = "@smoke or @functional" //to execute test cases with @smoke or @functional
				//tags = "@smoke and @regression" // to execute all the test cases with both @smoke and @regression
				tags = "not @functional"
				)
public class RunTest extends AbstractTestNGCucumberTests {

	
}
