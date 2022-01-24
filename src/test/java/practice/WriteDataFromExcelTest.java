package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data//commonData.properties");
	      Workbook wb=WorkbookFactory.create(fis);
	      Sheet sh=(Sheet) wb.getSheet("Sheet1");
	        Row row=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
	            Cell cel = row.createCell(5);
	            cel.setCellValue("pass");
	            FileOutputStream fos=new FileOutputStream("./data//commonData.properties");
	            wb.write(fos);
	            wb.close();

	}

}
