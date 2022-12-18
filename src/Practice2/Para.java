package Practice2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Vicky5");
		String us1=sheet.getRow(1).getCell(0).getStringCellValue();  System.out.println(us1);
		String pass1=sheet.getRow(1).getCell(1).getStringCellValue(); System.out.println(pass1);
		String us2=sheet.getRow(2).getCell(0).getStringCellValue(); System.out.println(us2);
		String pass2=sheet.getRow(2).getCell(1).getStringCellValue(); System.out.println(pass2);
		String us3=sheet.getRow(3).getCell(0).getStringCellValue(); System.out.println(us3);
		String pass3=sheet.getRow(3).getCell(1).getStringCellValue(); System.out.println(pass3);
		
		
	}

	
}
