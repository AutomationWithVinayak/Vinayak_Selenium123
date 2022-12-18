package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata4 {
	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(3);
		
		int row = sheet.getLastRowNum();
		System.out.println(row);
		
		int col = sheet.getRow(0).getLastCellNum(); 
		System.out.println(col);
		
		for(int r=0; r<=row; r++) {
			
			XSSFRow row1=sheet.getRow(r);
			
			for(int c=0; c<col; c++) {
				
				XSSFCell cell=row1.getCell(c);
				
				switch(cell.getCellType()) {
				
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				
				}
				System.out.print(" | ");
			
			}
			
			System.out.println();
			
			
		}
		
	}

}
