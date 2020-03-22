package br.com.rsinet.web_Project_BDD.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		, glue = "br.com.rsinet.web_Project_BDD.TestSteps"
		, monochrome = true
		, dryRun = false
		, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\marcos.souza\\Desktop\\Nova pasta\\workspace\\ProjetoCompraBDD\\Report\\report.html"}
		, tags = {"@CompraFalha"}
		)

public class Runner {
	@AfterClass
	public static void Report(){
		Reporter.loadXMLConfig(new File("C:\\Users\\marcos.souza\\Desktop\\Nova pasta\\workspace\\ProjetoCompraBDD\\report.xml"));
	}
	
}
