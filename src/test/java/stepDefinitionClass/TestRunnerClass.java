package stepDefinitionClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = {"stepDefinitionClass","Hooks"},
                 monochrome = true, 
                 dryRun = false,
                 snippets = SnippetType.CAMELCASE, 
                 strict = true,
                 tags = "@icic"
                                  
		)
public class TestRunnerClass {

}
