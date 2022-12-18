package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData6 {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path ="C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";
		FileInputStream f = new FileInputStream(path);
		
	boolean data = 	WorkbookFactory.create(f).getSheet("Vicky1").getRow(3).getCell(0).getBooleanCellValue();
		
		System.out.println(data);
		
		
	}
}
