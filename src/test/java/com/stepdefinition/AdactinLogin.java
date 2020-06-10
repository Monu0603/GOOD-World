package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinLogin {
	public static WebDriver driver;
	@Given("^user has to be there in login page$")
	public void user_has_to_be_there_in_login_page()  {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\AddacinCucumber\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
	   
	}


	@When("^user should enter \"(.*?)\" and \"(.*?)\"$")
	public void user_should_enter_and(String arg1, String arg2) {
    
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(arg1);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(arg2);
		WebElement cli = driver.findElement(By.id("login"));
	    cli.click();
		
	}

	@When("^user has to click on login page$")
	public void user_has_to_click_on_login_page()  {
		WebElement cli = driver.findElement(By.id("login"));
	    cli.click();
	}

	

}
