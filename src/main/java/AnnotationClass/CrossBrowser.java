package AnnotationClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import Dataprovider.CreateOrgTest;

public class CrossBrowser
{
	@Test
	@Parameters("BROWSER")
	@BeforeClass

	public void configBC(String BROWSER) throws InterruptedException 
	{
		System.out.println("=============Launch the Browser=======");
	
		Object driver;
	
		if(BROWSER.equals("chrome")) 
		{
		    driver = new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equals("ie")) 
		{
			driver = new InternetExplorerDriver();
		}
		else 
		{
			 driver = new ChromeDriver();
		}
          
	driver.wait(20);
	}
	
}
