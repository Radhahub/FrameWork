package practice;

import static org.testng.Assert.assertThrows;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
     FileInputStream fis=new FileInputStream("./data//commonData.properties");
      Workbook wb=WorkbookFactory.create(fis);
      Sheet sh=(Sheet) wb.getSheet("Sheet1");
        Row row=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
            Cell cel = row.getCell(2);
            String data = cel.getStringCellValue();
            System.out.println(data);
            wb.close();

	}

}
