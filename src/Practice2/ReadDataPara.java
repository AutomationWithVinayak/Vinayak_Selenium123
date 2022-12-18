package Practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataPara {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet data=WorkbookFactory.create(file).getSheet("Vicky3");
		
		int lastrow=data.getLastRowNum();
		int lastcell=data.getRow(0).getLastCellNum();
		
		System.out.println(lastrow);
		System.out.println(lastcell);
		
		for(int i=0; i<=lastrow; i++) {
			
			for(int j=0; j<lastcell; j++) {
				
				String values=data.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(values+"|");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
