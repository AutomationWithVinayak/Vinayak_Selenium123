package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData3 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream F = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		double data=WorkbookFactory.create(F).getSheet("Vicky2").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(data);
	}

	
}
