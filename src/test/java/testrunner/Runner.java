package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jatin on 4/4/2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefinition"},
        plugin = {"json:target/cucumber-report/cucumber.json"},
        monochrome = true
)
public class Runner {
}
