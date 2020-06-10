package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	public static WebDriver driver;
	@Given("^user has to enter valid \"(.*?)\" and \"(.*?)\"$")
	public void user_has_to_enter_valid_and(String arg1, String arg2){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\AddacinCucumber\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(arg1);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(arg2);
	  
	}

@When("^user has to select Location$")
public void user_has_to_select_Location()  {
   WebElement loc = driver.findElement(By.id("location"));
   Select s =new Select(loc);
   s.selectByVisibleText("London");
}

@When("^user has to select	Hotels$")
public void user_has_to_select_Hotels()  {
	WebElement hote = driver.findElement(By.id("hotels"));
	Select s1= new Select(hote);
	s1.selectByVisibleText("Hotel Creek");
    
}

@When("^user has to selectno of Rooms$")
public void user_has_to_selectno_of_Rooms()  {
	WebElement roomtype = driver.findElement(By.id("room_type"));
	Select s2= new Select(roomtype);
	s2.selectByVisibleText("Double");
  
}

@When("^user has to select Adult as per Room$")
public void user_has_to_select_Adult_as_per_Room() {
   WebElement Adult = driver.findElement(By.id("adult_room"));
   Select s3= new Select(Adult);
   s3.selectByVisibleText("2-Two");
}

@When("^user has to select children per Room$")
public void user_has_to_select_children_per_Room(){
	WebElement child = driver.findElement(By.id("child_room"));
	  Select s4= new Select(child);
	  s4.selectByVisibleText("1-One");
	
}

@Then("^User has to click on search button$")
public void user_has_to_click_on_search_button() {
   WebElement btn = driver.findElement(By.id("Submit"));
   btn.click();
}
}
