package com.demoProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.demoProject.generic.BaseTest;


public class loginPage extends BaseTest{

	//declare all the elements

	@FindBy (xpath="//input[@name='username']") private WebElement user;

	@FindBy (xpath = "//input[@name='password']") private WebElement pass;

	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private WebElement loginButton;

	
	// initialization => initializes all the @FindBy annotated WebElement fields in the LoginPage class

	public loginPage(WebDriver driver)   // Parameterized Constructor
	{
		PageFactory.initElements(driver, this);        // PageFactory method that initializes all the WebElements in the current class
	
	}


	// Utilization

	public WebElement getUsername() {
		return user;
	}


	public WebElement getPassword() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	// loginMethod

	public void loginMethod(String username, String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	}
	
	public void inValidloginMethod(String username2, String password2)
	{
		user.sendKeys(username2);
		pass.sendKeys(password2);
		loginButton.click();
	}




}
