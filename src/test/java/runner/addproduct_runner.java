package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/addproduct.feature",
tags = {"@tc02_addproduct"},
glue = {"steps"},
monochrome = true
)
public class addproduct_runner {

}
