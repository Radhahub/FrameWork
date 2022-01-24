package com.crm.pomobjpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	@FindBy(name="user_name")
	private WebElement 	userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement 	userPasswordEdt;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	
	public  Login(String USERNAME,String PASSWORD) 
	{
		userNameEdt.sendKeys(USERNAME);
		userPasswordEdt.sendKeys(PASSWORD);
			loginBtn.click();
			
		
	}

	public void loginToApp(String uSERNAME, String pASSWORD) {
		// TODO Auto-generated method stub
		
	}

}

