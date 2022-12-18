package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice4 {
	
	public static void main(String[] args) throws IOException {
		
		String path ="C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx";
		
		FileInputStream f=new FileInputStream(path);
		
		XSSFWorkbook workbook =new XSSFWorkbook(f);
		
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		
		int a=sheet.getLastRowNum();
		int b=sheet.getRow(0).getLastCellNum();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<=a; i++) {
			
			XSSFRow row= sheet.getRow(i);
			
			for(int j=0; j<b; j++) {
				
				XSSFCell cell=row.getCell(j);
				
				switch(cell.getCellType()) {
				
				case STRING:System.out.print(cell.getStringCellValue()); break;
				case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;
				
				}
				System.out.print(" | ");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
