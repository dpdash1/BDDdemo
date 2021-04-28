package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resource/", glue = "Mvn.DemoMavenProject", tags = {"@tag138"}, plugin = { "pretty" })


public class CucumberRunner2Test {

	
}
