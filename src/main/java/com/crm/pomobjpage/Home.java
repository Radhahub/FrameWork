package com.crm.pomobjpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	

	public WebDriver driver;

	public Home(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="organizations")
	private WebElement organizationLnk;
	
	@FindBy(linkText="products")
	private WebElement productLnk;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrationImg;
	
	@FindBy(linkText="signout")
	private WebElement signoutLnk;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganizationLnk() {
		return organizationLnk;
	}

	public WebElement getProductLnk() {
		return productLnk;
	}

	public WebElement getAdministrationImg() {
		return administrationImg;
	}

	public WebElement getSignoutLnk() {
		return signoutLnk;
	}
	
	public void logout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(administrationImg).perform();
			signoutLnk.click();
	}
	

}
