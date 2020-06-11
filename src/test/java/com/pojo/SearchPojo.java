package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SearchPojo extends Base {
	
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_nos")
	private WebElement roomsno;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;

	public WebElement getChildroom() {
		return childroom;
	}
	@FindBy(id="Submit")
	private WebElement btnclick;

	public WebElement getBtnclick() {
		return btnclick;
	}

	public void setBtnclick(WebElement btnclick) {
		this.btnclick = btnclick;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomsno() {
		return roomsno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	
}
