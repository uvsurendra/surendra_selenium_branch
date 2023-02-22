package com.stepdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepdef {
	private WebDriver driver;
	private WebDriverWait wait;
    LoginPage li;
   
	
	@Given("^User launch chrome browser$")
    public void user_launch_chrome_browser() throws Throwable {

		
		WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	li=new LoginPage(driver);
    
    }

    @When("^User opens url$")
    public void user_opens_url(DataTable value) throws Throwable {
        
    	List<List<String>> data=value.cells();
    	
    	driver.get(data.get(0).get(0));
    	
    	Thread.sleep(3000);
    	li.clickOnSignInLink();
    	Thread.sleep(3000);
    	
    }
    
    @When("User enters email and password")
    public void user_enters_email_and_password(DataTable value) throws Throwable {
    	List<List<String>> data=value.cells();
    	//enter username 
    	li.setEmailId(data.get(0).get(0));
       
    	//click on continue
    	Thread.sleep(3000);
    	li.clickOnButton();
    	
    	//enter password
    	Thread.sleep(3000);
    	li.setPassWord(data.get(0).get(1));
    	
        //click on siggnib button
    	li.clickOnSignInButton();
    	
    	
    	
       }

    @Then("^Verify the page title$")
    public void verify_the_page_title() throws Throwable {
    	
    	String title="Amazon.in : india";
    	Assert.assertEquals(driver.getTitle(), title);
    	Thread.sleep(3000);
    	
        
    }

   
	
	

}
