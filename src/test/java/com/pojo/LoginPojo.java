package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class LoginPojo extends Base {
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement username;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}

	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement btn;
}