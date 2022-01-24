package Dataprovider;

import org.testng.annotations.Test;

public class Customer {
	@Test(priority=1)
	public void createcustomerTest()
	{
	System.out.println("execute hdfc createcustomertest	");
	}
	@Test(priority=2)
public void modifycustomerTest()
{
System.out.println("execute  modify hdfc to airtel customertest");

}
	@Test(priority=3)
public void DeletecustomerTest()
{
System.out.println("execute  Delete airtel customertest");
}


}
