package practice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllRowDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream fis=new FileInputStream("./data//commonData.properties");
	      Workbook wb=WorkbookFactory.create(fis);
	      Sheet sh=(Sheet) wb.getSheet("Sheet2");
	              int count = ((org.apache.poi.ss.usermodel.Sheet) sh).getLastRowNum();
	              for(int i=1;i<count;i++)
	              {
	            	  Row row=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(i);
	            	                String firstcolData = row.getCell(0).getStringCellValue();
	            	                String secondcolData = row.getCell(1).getStringCellValue();
	            	                System.out.println(firstcolData+"\t"+secondcolData);
	            	                
	            	                
	              }
	              

	}

}
