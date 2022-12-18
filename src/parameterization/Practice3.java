package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx")	;
		
		Sheet s=WorkbookFactory.create(f).getSheet("Sheet1");
		
		double a=s.getLastRowNum();
		double b=s.getRow(0).getLastCellNum();
		
		for(int i=0; i<=a; i++) {
			for(int j=0; j<b; j++) {
				
				String d=s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(d+" | ");
				
			}
			System.out.println();
		}
		
				
		}
	
	}

