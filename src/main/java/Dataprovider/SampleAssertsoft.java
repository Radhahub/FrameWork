package Dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssertsoft 
{
@Test
	
	public void test1()
	{
	SoftAssert soft=new SoftAssert();
		System.out.println("step_1");
		System.out.println("step_2");
		Assert.assertEquals("a", "a");
		System.out.println("step_3");
		Assert.assertEquals("b", "b");
		System.out.println("step_4");
		System.out.println("step_5");
		soft.assertAll();
	}
	@Test
public void test2() 
{
	System.out.println("step_1");
	System.out.println("step_2");
	Assert.assertEquals("A", "A");
	System.out.println("step_3");
	System.out.println("step_4");
	Assert.assertEquals("B", "B");
	System.out.println("step_5");
}
}


