package cucumber.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		plugin = {"html:target/cucumber-report.html","pretty"},
		snippets=SnippetType.CAMELCASE)
public class MyCukeRunner {

}
