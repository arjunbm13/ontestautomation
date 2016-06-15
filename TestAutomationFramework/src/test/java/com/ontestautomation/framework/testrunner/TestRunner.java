package com.ontestautomation.framework.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	features="src/test/resources/features/",
					glue="com.ontestautomation.framework.stepdefinitions")
public class TestRunner {
}
