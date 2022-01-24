package Dataprovider;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast_genericlibraries.BaseClass;

public class SampleTest extends BaseClass
{
	@Test		
	public void verifyHomePage()
	{
		System.out.println("=======Test Start========");
		String expectedTitle="Home".trim();
		System.out.println("capture page title");
		        String actTitle = driver.getTitle().trim();
		        Assert.assertEquals(actTitle, expectedTitle);
		        System.out.println("=====Test End======");
	}

@Test
public void verifyLogoInHomePage()
{
	System.out.println("=======Test Start========");
	System.out.println("capture the logo status");
	driver.findElement(By.xpath("//img[@title='vtiger-crm--logo-gif]")).click();
	boolean actStstus = false;
	Assert.assertTrue(actStstus);
	System.out.println("======Test End====");
}

}
