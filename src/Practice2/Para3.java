package Practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Para3 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
		
		Sheet XlSheet=workbook.getSheet("Vicky3");
		
		int countrow=XlSheet.getLastRowNum();
		int countcell=XlSheet.getRow(0).getLastCellNum();
	
		for(int i=0; i<=countrow; i++) {
			
			Row rowdata = XlSheet.getRow(i);
		
			for(int j=0; j<countcell; j++) {
				
				Cell celldata = rowdata.getCell(j);
				
				switch(celldata.getCellType()) {
				
				case STRING:System.out.print(celldata.getStringCellValue()); break;
				case NUMERIC:System.out.print(celldata.getNumericCellValue()); break;
				case BOOLEAN:System.out.print(celldata.getBooleanCellValue()); break;
				
				
				}
				System.out.print("|");
			}
			System.out.println();
			
			
			
		}
	
	}

}
