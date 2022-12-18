package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class para7 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx");
		
	
	Sheet sheet=WorkbookFactory.create(file).getSheet("Vicky3");
	
	CellType datatype=sheet.getRow(1).getCell(0).getCellType();
			
	System.out.println(datatype);
	
	if(datatype==CellType.STRING) {
	String a=	sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(a);
	}
	else if(datatype==CellType.NUMERIC) {
	double b=	sheet.getRow(1).getCell(0).getNumericCellValue();
	System.out.println(b);
	}
	else if(datatype==CellType.BOOLEAN) {
	boolean c=	sheet.getRow(1).getCell(0).getBooleanCellValue();
	System.out.println(c);
	}
	
	
	}

}
