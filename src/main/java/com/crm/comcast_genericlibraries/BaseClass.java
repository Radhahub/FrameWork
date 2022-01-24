	package com.crm.comcast_genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.pomobjpage.Home;
import com.crm.pomobjpage.Login;

public class BaseClass 
{
     public static WebDriver sdriver;

	@Test
     public void BaseClass() 
     {
    	 
     }
	public WebDriver driver;
	  /*Object Creation for Lib*/
		public JavaUtility jLib = new JavaUtility();
 		public WebDriverUtility wLib = new WebDriverUtility();
		public FileUtility fLib = new FileUtility();
		public ExcelUtility eLib = new ExcelUtility();
	
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS()
	{
		System.out.println("========================connect to DB========================");
               
	}
		
	@BeforeClass
	public void configBC() {
		System.out.println("=============Launch the Browser=======");
		driver = (WebDriver) new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void configBM() throws Throwable 
	{
		/*common Data*/
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String URL = fLib.getPropertyKeyValue("url");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		/* Navigate to app*/
		   driver.get(URL);
	        /* step 1 : login */
	        Login lp=new Login(driver);		
		 lp.loginToApp(USERNAME, PASSWORD);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void configAM() {
	      /*step 6 : logout*/
		Home homePage = new Home(driver);
      homePage.logout();
	}
	
	@AfterClass
	public void configAC()
		{
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() 
	{
		System.out.println("========================close DB========================");
	}


}

	


