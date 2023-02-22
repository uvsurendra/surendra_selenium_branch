package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjects.FacebookLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class FacebookStep {
	public WebDriver driver;
	FacebookLogin fb;

	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		fb= new FacebookLogin();
		
	    
	}

	@When("User Open url")
	public void user_open_url(DataTable dataTable) {
	   
	    
	}

	@When("User enter email and password")
	public void user_enter_email_and_password(DataTable dataTable) {
          
	    
	}

	@Then("Verfiy the page title")
	public void verfiy_the_page_title() {
	    
	}

	
	
}
