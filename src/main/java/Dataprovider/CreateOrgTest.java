package Dataprovider;




import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;






public class CreateOrgTest  
{
@Test

public  void CreateOrgTest() throws IOException
{
	
	FileInputStream fis=new FileInputStream("./Data/commonData.properties");
	 Properties pobj=new Properties();
	 pobj.load(fis);
	String BROWSER= pobj.getProperty("browser");
	 String URL = pobj.getProperty("url");
	 String USERNAME = pobj.getProperty("username");
       String PASSWORD = pobj.getProperty("password");
       Random ran=new Random();
            int ranDomNum = ran.nextInt();
           
	
            FileInputStream fis_e=new FileInputStream("./Data/excel.xls");
                       Workbook wb=WorkbookFactory.create(fis_e);
                      org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Org");
                        Row row=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
                             String orgName = row.getCell(2).getStringCellValue()+ranDomNum;
                            WebDriver driver = null;
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
					
                     		driver.get(URL);
                     		driver.findElement(By.name("user_name")).sendKeys(USERNAME); 
                     		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
                     		driver.findElement(By.id("submitButton")).click();
                     		
                     		driver.findElement(By.linkText("Organizations")).click();
                     		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
                     		driver.findElement(By.name("accountname")).sendKeys(orgName);
                     		
                     		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
                     		String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
                     		Properties actSuc_msg=pobj;
						if(actSuc_msg.contains(orgName)) 
                     		{
                     			//System.out.println("org is successfully created....pass");
                     		}
                     		else
                     		{
                     			//System.out.println("org is not crated Fail......");
                     	}
                     		Actions act=new Actions(driver);
                     		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
                     		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
                     		driver.quit();
                     	}
	 

}
