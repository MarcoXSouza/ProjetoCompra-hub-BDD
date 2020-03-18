package br.com.rsinet.web_Project_BDD.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		, glue = "br.com.rsinet.web_Project_BDD.TestSteps"
		, monochrome = true
		, dryRun = false
		, tags = {"@CompraSucesso"}
		)

public class Runner {

}
