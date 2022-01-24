package Dataprovider;

import org.testng.annotations.Test;

class customerTest 
{
@Test(groups= {"SmokeTest"})
	public void createcustomerTest()
	{
	System.out.println("execute hdfc createcustomertest	");
	}
@Test(groups= {"RegressionTest"})
public void modifycustomerTest()
{
System.out.println("execute hdfc modifiercustomertest");

}
@Test(groups= {"SmokeTest,RegressionTest"})
public void DeletecustomerTest()
{
System.out.println("execute hdfc Deletecustomertest");
}
}
