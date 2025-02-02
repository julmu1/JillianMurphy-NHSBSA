package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "classpath:features",
        glue = {"stepDefinitions", "hooks"},
        plugin = {"pretty", "summary",  "json:target/cucumber.json" ,"html:target/cucumber-html.html"}
)

public class RunnerTest {
}
//monochrome cleans the last test, features is the path to the features file and
//glue combines the stefDefinitions and the hooks