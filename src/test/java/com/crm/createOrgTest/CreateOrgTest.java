package com.crm.createOrgTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateOrgTest 
{


@Test
public void CreateOrgTest() throws IOException
{
	FileInputStream fis=new FileInputStream("./Data/commonData.properties");
	 Properties pobj=new Properties();
	 pobj.load(fis);
	String BROWSER= pobj.getProperty("browser");
	 //String URL = pobj.getProperty("url");
	 //String USERNAME = pobj.getProperty("username");
      //String PASSWORD = pobj.getProperty("password");
    //  Random ran=new Random();
      //     int ranDomNum = ran.nextInt();
          
	
	
}
}
