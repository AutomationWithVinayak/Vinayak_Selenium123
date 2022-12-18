package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData7 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path ="C:\\Users\\hp elitebook\\Desktop\\TestData\\Testdata.xlsx";

			 FileInputStream file = new FileInputStream(path);
		     Sheet	data= WorkbookFactory.create(file).getSheet("Vicky3");
		    
		   int LastrowNo = data.getLastRowNum();
		   System.out.println(LastrowNo);
		   
		   for(int i=0;i<=LastrowNo;i++) {
			   
			   for(int j=0;j<data.getRow(i).getLastCellNum();j++) {
				   
				 String value= data.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(value+ " | ");
			   }
			   System.out.println();
		   }		 
		}

	}
