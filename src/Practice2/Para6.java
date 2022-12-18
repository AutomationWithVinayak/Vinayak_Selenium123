package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para6 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");	
		
		CellType findtype=WorkbookFactory.create(file).getSheet("Vicky3").getRow(0).getCell(0).getCellType();
		
		System.out.println(findtype);
		
		
         FileInputStream file1 = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");	
		
		CellType findtype1=WorkbookFactory.create(file1).getSheet("Vicky3").getRow(3).getCell(1).getCellType();
		
		System.out.println(findtype1);
		
		
		 FileInputStream file2 = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");	
			
			CellType findtype2=WorkbookFactory.create(file2).getSheet("Vicky3").getRow(3).getCell(0).getCellType();
			
			System.out.println(findtype2);
			
             FileInputStream file3 = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");	
			
			CellType findtype3=WorkbookFactory.create(file3).getSheet("Vicky3").getRow(3).getCell(2).getCellType();
			
			System.out.println(findtype3);
			
			
			
			
	}
	

}
