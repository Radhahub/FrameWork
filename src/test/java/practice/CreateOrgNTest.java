package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateOrgNTest {
   @BeforeClass
   public void configBC()
   {
	   System.out.println("=======launch the browser=====");
   }
	
@BeforeMethod 
	public void configBM()
	{
	System.out.println("=========Launch the Browser");
	System.out.println("=======Login======");
	}
 @AfterMethod
 public void configAM()
 {
	 	System.out.println("=========Close the Browser");
		System.out.println("=======Logout======");
 }
  @Test
  public void CreateOrgTest()
  {
	  System.out.println("navigate to Org Module");
	  	System.out.println("create Org");
		System.out.println("verify");
  }
     @Test
     public void CreateOrgWithIndstriesTest()
     {
    	  System.out.println("navigate to Org Module");
  	  	System.out.println("create Org with industries");
  		System.out.println("verify");
     }
     @Test
     public void CreateOrgWithRatingTest()
     {
    	  System.out.println("navigate to Org Module");
  	  	System.out.println("create Org with rating");
  		System.out.println("verify");
     }
     
     @AfterClass
     public void confingAC()
     {
    	 System.out.println("======close the browser=====");
     }
}
