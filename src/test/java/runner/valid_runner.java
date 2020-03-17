package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/validlogin.feature",
tags = {"@tc01_validlogin"},
glue = {"steps"},
monochrome = true
)

public class valid_runner {
	

}
