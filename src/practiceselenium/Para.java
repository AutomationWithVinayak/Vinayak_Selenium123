package practiceselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		

		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		String usern=sheet.getRow(0).getCell(0).getStringCellValue();
		String pass=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(usern);
		System.out.println(pass);
		
		
		
		
		
		
		
		
		
	}
	
}
