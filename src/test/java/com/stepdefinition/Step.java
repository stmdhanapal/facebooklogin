package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Login;

public class Step extends BaseClass {
	
	static WebDriver driver;
	
	Login l;

	@Given("^lanch the browser and enter the url$")
	public void lanch_the_browser_and_enter_the_url() throws Throwable {
				
		   driver=getDriver("chrome");
		   
	}

	@When("^user gives  email \"([^\"]*)\"$")
	public void user_gives_email(String email) throws Throwable {
	    
		l=new Login(driver);
		setText(l.getEmail(), email);
	}

	@Then("^user gives lastname \"([^\"]*)\"$")
	public void user_gives_lastname(String pass) throws Throwable {
		l=new Login(driver);
		setText(l.getPass(), pass);
	}


	
}
