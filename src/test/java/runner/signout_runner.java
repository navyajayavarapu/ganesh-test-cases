package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/signout.feature",
tags = {"@tc05_signout"},
glue = {"steps"},
monochrome = true
)
public class signout_runner {

}
