package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicket {
   @Test(dataProvider="dataprovider_BookTicketTest")
   
	public void BookTicketTest(String src,String dest) 
	{
	System.out.println("Book Ticket from"+src+"to"+dest); 
	}
    @DataProvider
     
    public Object[][] dataProvider_BookTicketTest()
    {
    	Object[][] objArr=new Object[5][2];	
     objArr[0][0]="Bangalore";
     objArr[0][1]="goa";
     
     objArr[1][0]="Bangalore";
     objArr[1][1]="mysore";
     
     objArr[2][0]="Bangalore";
     objArr[2][1]="mangalore";
     
     objArr[3][0]="Bangalore";
     objArr[3][1]="hyd";
     
     objArr[4][0]="Bangalore";
     objArr[4][1]="goa";
     
		return objArr;
    	
    }
}
