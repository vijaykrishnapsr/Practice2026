package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles", 
        glue = {"stepdefinitions","HooksPackage"}, 
        tags = "@regression", 
        plugin = { "pretty", "html:target/htmlreports/html-report.html", 
		"json:target/jsonreports/json-report.xml",
		"junit:target/junitreports/junit-report.xml" }, 
        dryRun = false, 
        monochrome = true

)

public class TestRunner {

}
