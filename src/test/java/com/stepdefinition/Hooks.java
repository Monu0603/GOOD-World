package com.stepdefinition;

import java.util.Date;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	
	public void beforemethod() {
		Date D =new Date();
	System.out.println(D);

	}

	@After
	public void AfterMethod() {
		Date D = new Date();
		System.out.println(D);

	}

}
