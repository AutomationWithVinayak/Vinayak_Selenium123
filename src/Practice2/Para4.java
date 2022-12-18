package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para4 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new  FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		Sheet sheet=WorkbookFactory.create(file).getSheet("Vicky3");
		
		int a=sheet.getLastRowNum();
		int b=sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<=a; i++ ) {
			
		String Rowdata =	sheet.getRow(i).getCell(1).getStringCellValue();
		
		System.out.println(Rowdata);
		
	
		}
	}

}
