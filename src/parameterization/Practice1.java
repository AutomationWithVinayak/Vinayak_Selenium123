package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		String data=WorkbookFactory.create(file).getSheet("Vicky5").getRow(3).getCell(2).getStringCellValue();
		
		System.out.println(data);
		
		
		
	}

}
