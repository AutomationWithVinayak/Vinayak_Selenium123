package Practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class para5 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		Sheet sheet= WorkbookFactory.create(file).getSheet("Vicky3");
		
		int a= sheet.getLastRowNum();
		System.out.println(a);
		
		int b=sheet.getRow(0).getLastCellNum();
		
		System.out.println(b);
		
		
		
		for(int i=0; i<=a; i++) {
			
			Row row= sheet.getRow(i);
			
			for(int j=0; j<b; j++) {
			Cell cell=	row.getCell(j);
			
			CellType cell1=sheet.getRow(i).getCell(j).getCellType();
			
			if(cell1==CellType.NUMERIC) {
				System.out.print(cell.getNumericCellValue());
				
			}
			else if(cell1==CellType.STRING) {
				System.out.print(cell.getStringCellValue());
				
			}
			else if(cell1==CellType.BOOLEAN) {
				System.out.print(cell.getBooleanCellValue());
				
			}
			
			System.out.print("|");
				
			}
			System.out.println();
			
			
			
		}
		
	}

}
