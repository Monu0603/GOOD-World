package com.stepdefinition;

import com.base.Base;
import com.pojo.LoginPojo;
import com.pojo.SearchPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelLogin extends Base {

	
	@Given("^user has to be there in login page$")
	public void user_has_to_be_there_in_login_page()  {
	    Launchbrowser();
	    Loadurl("http://adactinhotelapp.com/");
	}

	@When("^user should enter username and password$")
	public void user_should_enter_username_and_password() throws Throwable {
		LoginPojo p = new LoginPojo();
		Thread.sleep(3000);
		Fill(p.getUsername(), getdata(1, 0));
		Fill(p.getPass(), getdata(1, 1));
	}

	@When("^user has to click on login page$")
	public void user_has_to_click_on_login_page() throws Throwable {
		LoginPojo p1 = new LoginPojo();
		btnclick(p1.getBtn());
	}

	@Given("^User has to be there at login page$")
	public void user_has_to_be_there_at_login_page() throws Throwable {
		Launchbrowser();
		Loadurl("http://adactinhotelapp.com/");
		}

	@When("^user has to enter valid username and password and click on login$")
	public void user_has_to_enter_valid_username_and_password_and_click_on_login() throws Throwable {
		LoginPojo p = new LoginPojo();
		Fill(p.getUsername(), getdata(1, 0));
		Fill(p.getPass(),getdata(1, 1));
		btnclick(p.getBtn());
	}

	@When("^user has to select Location$")
	public void user_has_to_select_Location() throws Throwable {
		SearchPojo p1 = new SearchPojo();
		SBI(p1.getLocation(), 2);
	}

	@When("^user has to select	Hotels$")
	public void user_has_to_select_Hotels() throws Throwable {
		SearchPojo p2 = new SearchPojo();
		SBI(p2.getHotel(), 1);
	}

	@When("^user has to selectno of Rooms$")
	public void user_has_to_selectno_of_Rooms() throws Throwable {
		SearchPojo p3 = new SearchPojo();
		SBI(p3.getRoomsno(), 2);
	}

	@When("^user has to select Adult as per Room$")
	public void user_has_to_select_Adult_as_per_Room() throws Throwable {
		SearchPojo p4 = new SearchPojo();
		SBI(p4.getAdultroom(), 1);
	}

	@When("^user has to select children per Room$")
	public void user_has_to_select_children_per_Room() throws Throwable {
		SearchPojo p5 = new SearchPojo();
		SBI(p5.getChildroom(),0);
	}

	@Then("^User has to click on search button$")
	public void user_has_to_click_on_search_button() throws Throwable {
		SearchPojo p6 = new SearchPojo();
		   btnclick(p6.getBtnclick());
	}
}
