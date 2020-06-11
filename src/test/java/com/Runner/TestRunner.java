package com.Runner;

import org.junit.After;
import org.junit.runner.RunWith;

import com.stepdefinition.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",monochrome= true,
plugin= {"pretty","junit:Report\\XmlReport\\addactin.xml",
		"json:Report\\JsonReport\\addactin.json","html:Report\\htmlReport"})
public class TestRunner {

	@After
	public static void Reportgeneration() {
		JVMReport.generater(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\JsonReport");
System.out.println("Report Generated");
	}
}
