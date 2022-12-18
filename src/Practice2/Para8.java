package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para8 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		String col1 =sheet.getRow(0).getCell(0).getStringCellValue();
		String col2=sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(col1);
		System.out.println(col2);
		
		
		
	}

}
