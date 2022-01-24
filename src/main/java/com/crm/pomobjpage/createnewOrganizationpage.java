package com.crm.pomobjpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast_genericlibraries.BaseClass;

public class createnewOrganizationpage 
{

	public createnewOrganizationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
				 
	}
		@FindBy(name="accountname")
		private WebElement orgNameEdt;
		
		@FindBy(xpath="//input[@title=save[Alt+S]']")
	private WebElement saveBtn;
   public void  createOrg(String orgName, String industriesType)
   {
	   orgNameEdt.sendKeys(orgName);
	   saveBtn.click();
   }
public void createOrg(String orgName, String rating, boolean b) {
	// TODO Auto-generated method stub
	
}
public void createOrg(String orgName) {
	// TODO Auto-generated method stub
	
}
}
