package com.crm.pomobjpage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateOrgTest
{
	@BeforeSuite(groups = {"smokeTest","regressionTest"})	
	public void configBS() 
	{
		System.out.println("======Execute BeforeSuite=============");
		
	}
	@Test(groups={"smokeTest"})
	public void createCustomerTest()
     { 
		System.out.println("execute createCustomerTest");
	}
	@Test(groups={"regressionTest"})
	public void modifyCustomerTest()
     {
		System.out.println("execute modifyCustomerTest");
     }
	}
		
	