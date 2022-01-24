package com.crm.pomobjpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationInfo 
{
	public organizationInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='lvtHeaderText']")
  private WebElement succesfullMsg;
	
	public WebElement getSuccesfullMsg() 
	{
		return succesfullMsg;
	}

	public WebElement getRatingTypeinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getIndutryTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
