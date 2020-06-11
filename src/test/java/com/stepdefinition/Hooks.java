package com.stepdefinition;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {

	@Before
	
	public  void before() {
		System.out.println(new Date());

	}
	@After
	public  void after(Scenario Scenario) {
		System.out.println(new Date());
TakesScreenshot tk = (TakesScreenshot)driver;
byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
Scenario.embed(screenshotAs, "image/png");
	}
}
