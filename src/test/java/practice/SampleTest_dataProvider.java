package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest_dataProvider {
	
	@Test(dataProvider="bookTicketdataProvider")

	public void BookTicket(String src,String dest,int ticket) 
	{
	System.out.println("execute source=>"+src+",Destination==>"+dest);
	}
    @DataProvider
     
    public Object[][] bookTicketdataProvider() 
    {
    	Object[][] objArr=new Object[5][3];	
     objArr[0][0]="Bangalore";
     objArr[0][1]="goa";
     objArr[0][2]=10;
     
     objArr[1][0]="Bangalore";
     objArr[1][1]="mysore";
     objArr[1][2]=10;
     
     objArr[2][0]="Bangalore";
     objArr[2][1]="mangalore";
     objArr[2][2]=10;
     
     objArr[3][0]="Bangalore";
     objArr[3][1]="hyd";
     objArr[3][2]=10;
     
     objArr[4][0]="Bangalore";
     objArr[4][1]="goa";
     objArr[4][2]=10;
     
		return objArr;
    	
    }
}