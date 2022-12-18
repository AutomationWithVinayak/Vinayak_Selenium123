package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";

		FileInputStream file = new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("Vicky1").getRow(0).getCell(0).getStringCellValue();
	
		System.out.println(data);
		System.out.println();
		
		FileInputStream f1 =new FileInputStream(path);
	    double data1=	WorkbookFactory.create(f1).getSheet("Vicky1").getRow(9).getCell(4).getNumericCellValue();
		System.out.println(data1);
		
		System.out.println();
		
		FileInputStream f2=new FileInputStream(path);
		double data2=WorkbookFactory.create(f2).getSheet("Vicky1").getRow(9).getCell(5).getNumericCellValue();
		System.out.println(data2);
		
		
		
	}
}
