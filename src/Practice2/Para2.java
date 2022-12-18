package Practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Para2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream xl = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(xl);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	int rowcount=sheet.getLastRowNum();
	System.out.println(rowcount);
	
    int cellcount=sheet.getRow(0).getLastCellNum();
	System.out.println(cellcount);
	
	
	for(int i=0; i<=rowcount; i++) {
	Row rowdata=sheet.getRow(i);
	
	for(int j=0; j<cellcount; j++) {
		
	Cell celldata=rowdata.getCell(j);
		
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
