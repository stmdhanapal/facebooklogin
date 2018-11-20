package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\",glue="com.stepdefinition",plugin= {"pretty","html:Reports","junit:Reports/cucumber.xml","json:Reports/cucumber.json"})
public class RunnerClass {

}
