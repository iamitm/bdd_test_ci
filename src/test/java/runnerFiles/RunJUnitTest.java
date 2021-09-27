package runnerFiles;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" })
public class RunJUnitTest extends AbstractTestNGCucumberTests{
}
