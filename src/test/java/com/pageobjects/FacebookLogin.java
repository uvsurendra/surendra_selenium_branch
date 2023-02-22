package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {
	//welcome to selenium suing selenium
	public WebDriver ldriver;
	public WebDriverWait wait;
	
	public void FacebookLogin(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(id="email")
	private WebElement emailInputBox;
	
	@FindBy(id="pass")
	private WebElement passInputBox;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement clickOnLoginButton;
	
	public void userEmail(String email) {
		emailInputBox.clear();
		emailInputBox.sendKeys(email);
	}
		
	public void userPassword(String pass) {
		passInputBox.sendKeys(pass);
	}
	public void userLogin() {
		clickOnLoginButton.click();
		
	}
		
	

}
