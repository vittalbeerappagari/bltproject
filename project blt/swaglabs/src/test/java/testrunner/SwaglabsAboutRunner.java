package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/swaglabs.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC03_Swaglabs"},
		glue = {"stepdefinition.SwaglabsAboutStep"},
		monochrome = true
		)

public class SwaglabsAboutRunner {

}
