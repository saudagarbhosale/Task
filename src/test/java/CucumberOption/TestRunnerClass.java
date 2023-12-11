package CucumberOption;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:/Users/Saudagar.Bhosale/Documents/java/Task/Task0912/src/test/java/FeatureFile",
glue={"StepDefinationsfiles"},  dryRun=false, plugin= {"pretty",	"html:target/cucumber-report.html","json:target/cucumber-report"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object [][] scenarios()
	{
		return super.scenarios();
	}
}