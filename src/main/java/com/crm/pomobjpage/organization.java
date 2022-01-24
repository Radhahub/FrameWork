package com.crm.pomobjpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organization 
{
	public 	organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement 	createOrgImg;
	
	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}
}
