package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		String path="C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";
		
		FileInputStream F =new FileInputStream(path);
		
		
		
	    String data = WorkbookFactory.create(F).getSheet("Vicky2").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		Thread.sleep(1000);
		
		
		
		
		
	}

}
