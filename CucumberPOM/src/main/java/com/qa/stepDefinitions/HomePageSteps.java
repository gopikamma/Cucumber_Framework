package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase
{

	LoginPage loginpage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()
	{
		TestBase.initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page()
	{
		loginpage = new LoginPage();
		
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",title);
	  
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() 
	{
		homePage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	

	@Then("^validate home page title$")
	public void validate_home_page_title()
	{
		String homeTitle = homePage.verifyHomePageTitle();
	    Assert.assertEquals("CRMPRO", homeTitle);

	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws InterruptedException
	{
		Thread.sleep(5000);
	  boolean flag = homePage.verifyCorrectUserName();
	  Assert.assertTrue(flag);
	}
}
