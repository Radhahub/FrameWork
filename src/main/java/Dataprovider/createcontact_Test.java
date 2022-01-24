package Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.crm.comcast_genericlibraries.ExcelUtility;
import com.crm.comcast_genericlibraries.FileUtility;
import com.crm.comcast_genericlibraries.JavaUtility;
import com.crm.comcast_genericlibraries.WebDriverUtility;




public class createcontact_Test {
	
	

	@Test
	public void createcontact_Test() 
	{
		JavaUtility jLib = new JavaUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
	
	
		WebDriver driver=null;
		String BROWSER = fLib.readDatafromPropertyfile("browser");
		String URL = fLib.readDatafromPropertyfile("url");
		String USERNAME = fLib.readDatafromPropertyfile("username");
		String PASSWORD = fLib.readDatafromPropertyfile("password");	
		
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
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
	}
}


