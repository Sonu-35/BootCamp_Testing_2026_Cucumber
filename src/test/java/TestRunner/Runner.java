package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Selenium Complete Programs\\Cucumber_BootCamp\\Features\\EndToEndTesting.feature", 
	glue = {"StepDefination"},
	plugin = {"pretty", "html:test-output",
			"json:json_output/cucumber.json",
			"junit:junit_xml/cucumber.xml"},
	monochrome = true
		)

public class Runner {

}
