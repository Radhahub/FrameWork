package Dataprovider;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.comcast_genericlibraries.ExcelUtility;
import com.crm.comcast_genericlibraries.FileUtility;
import com.crm.comcast_genericlibraries.JavaUtility;
import com.crm.comcast_genericlibraries.WebDriverUtility;

public class CreateOrgWithIndTy
{
	//@Parameters("BROWSER")
	
	//@BeforeClass
	//public void configBC(String BROWSER) 
	{
		System.out.println("=============Launch the Browser=======");
	}
	@Test
	
	public void CreateOrgWithIndTy() throws Throwable 
	{
	FileInputStream fis=new FileInputStream("./Data/commonData.properties");
	 Properties pobj=new Properties();
	 pobj.load(fis);
		JavaUtility jLib = new JavaUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
	
	
		WebDriver driver=null;
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");	
		
		if(BROWSER.equalsIgnoreCase("chrome"))
 		{
 			driver =new ChromeDriver();
 		}
 		else if(BROWSER.equalsIgnoreCase("firefox"))
 		{
 			driver=new FirefoxDriver();
 		}
 		else
 		{
 			System.out.println("invalid browser");
 		}
	
		wLib.maximizeWindow(driver);
		wLib.waitForpageLoad(driver);
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		String OrgName = eLib.getDataFromExcel("Org", 4, 2)+jLib.getRanDomNumber();
		String Indus = eLib.getDataFromExcel("Org", 4, 3);
		String Cust = eLib.getDataFromExcel("Org", 4, 4);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
		WebElement ele = driver.findElement(By.xpath("//select[@name='industry']"));
		wLib.select(ele, Indus);
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		wLib.select(ele2, Cust);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actData.contains(OrgName)) 
		{
			System.out.println("TestCase Pass.......");
		}
		else
		{
			System.out.println("TestCase Fail......");
		}
		WebElement ele3 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOver(driver, ele3);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		driver.quit();

	}


//  @Parameters("BROWSER")
//@AfterClass
public void confgAC(String BROWSER) 
{
	System.out.println("=============Close the Browser=======");
}
}

