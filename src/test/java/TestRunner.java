
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

//@CucumberOptions(plugin = "json:target/cucumber-report-composite.json")

/*@CucumberOptions(
		features = "src/test/resources/features"
		,strict = true
		,glue={"stepdefinitions"}
		)*/

public class TestRunner {

    @Test(groups = "cucumber", description = "Example of using TestNGCucumberRunner to invoke Cucumber")
    public void TestRunnerMethod() {
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}