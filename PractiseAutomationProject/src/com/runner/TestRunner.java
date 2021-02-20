package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "com.stepdef", dryRun = false, tags = "@image", plugin = { "pretty",
		"json:target/cucumber.json", "html:target/index.html" })

public class TestRunner {

}
