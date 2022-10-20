package interview.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-html-reports"},
        features = "src/test/resources/interviewFeatures",
        glue = "interview/StepDefinitions",
        dryRun = false,
        tags = ""
)
public class Runner {
}
