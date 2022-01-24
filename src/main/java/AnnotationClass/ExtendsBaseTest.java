package AnnotationClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.crm.comcast_genericlibraries.BaseClass;

public class ExtendsBaseTest extends BaseClass
{
	@Parameters("BROWSER")
	@BeforeClass
	public void configBC(String BROWSER) {
		System.out.println("=============Launch the Browser=======");
		RemoteWebDriver driver = null;
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Object wLib;
		  // ((Object) wLib).waitUntilPageLoad(driver);
		driver.manage().window().maximize();
	}
	


}
