package Dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAssert 
{
	@Test
	
	public void test1()
	{
		System.out.println("step_1");
		System.out.println("step_2");
		Assert.assertEquals("a", "b");
		System.out.println("step_3");
		Assert.assertEquals("b", "b");
		System.out.println("step_4");
		System.out.println("step_5");
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
