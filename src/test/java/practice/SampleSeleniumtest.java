package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.comcast_genericlibraries.AutoConstant;

public class SampleSeleniumtest
{
        public static void main(String[] args) throws IOException
    {
	
	FileInputStream fis=new FileInputStream("/com.crm_selenium_framework/src/test/resources/commonData.properties");
	 Properties pobj=new Properties();
	 pobj.load(fis);
	 String BROWSER=pobj.getProperty("browser");
	 String URL=pobj.getProperty("url");
	 String USERNAME=pobj.getProperty("username");
	 String PASSWORD=pobj.getProperty("password");
	 WebDriver driver=new ChromeDriver();
	 driver.get(URL);
	 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	 driver.findElement(By.id("submitButton")).click();
		}
}
