package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream f = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		Sheet s=WorkbookFactory.create(f).getSheet("Vicky5");
		
		int a=s.getLastRowNum();
		int b=s.getRow(0).getLastCellNum();
		System.out.print("|"+a+"|"+"|");
		System.out.print(b+"|");
		System.out.println();
		
		for(int i=0; i<=a; i++) {
			for(int j=0; j<b; j++) {
				
				String d=s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(d+" | ");
			}
			System.out.println();
		}
		
			
	}

}
