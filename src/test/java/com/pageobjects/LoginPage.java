package com.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

   public class LoginPage {
     public WebDriver ldriver;
     public WebDriverWait wait;
     
     public LoginPage(WebDriver rdriver) {//rdriver=new ChromeDriver();
    	 ldriver = rdriver;//ldriver=
         PageFactory.initElements(rdriver,this);
         wait=new WebDriverWait(ldriver,Duration.ofSeconds(5000));
     }
     @FindBy(xpath="//span[text()='Hello, sign in']")
     private WebElement clickOnSignIn;
    
     @FindBy(id="ap_email")
     private WebElement emailTextBox;
     
     @FindBy(id="continue")
     private WebElement loginButton;
     
     @FindBy(id="ap_password")
     private WebElement passTextBox;
     
     @FindBy(id="signInSubmit")
     private WebElement signInButton;
     
     
     public void clickOnSignInLink() {
    	 clickOnSignIn.click();
    	 
     }
     public void setEmailId(String email) {
    	 emailTextBox.clear();
    	 emailTextBox.sendKeys(email);
    	 
    	 
     }
     public void clickOnButton() {
    	 wait.until(ExpectedConditions.visibilityOf(loginButton));
    	 loginButton.click();
    	 
    	 
     }
     
     public void setPassWord(String pass) {
    	 emailTextBox.clear();
    	 passTextBox.sendKeys(pass);
    	 
     }
     public void clickOnSignInButton() {
    	 signInButton.click();
    	 
     }
     
     
}
