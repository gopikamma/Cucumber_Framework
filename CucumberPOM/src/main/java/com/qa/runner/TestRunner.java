package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Work_Space\\Naven\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature",
		glue={"com/qa/stepDefinitions"},
		monochrome = true,
		format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		strict = true,
		dryRun = false
		//tags = {"@RegressionTest"}
		
		)
public class TestRunner {

}
