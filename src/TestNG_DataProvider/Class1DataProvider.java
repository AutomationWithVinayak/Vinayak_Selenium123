package TestNG_DataProvider;

import org.testng.annotations.*;

public class Class1DataProvider {



	@Test(dataProvider ="getTestData")
	public void kiteTest(String username , String password) {

		System.out.println(username);
		System.out.println(password);
		System.out.println();
		
	}

	/*1st   Correct username and PAssword  > 2nd - Correct username and Wrong password  > 3rd - Wrong username and correct password  > 4th - Wrong usename and password*/

	@DataProvider(name="getTestData")
	public Object[][] getData() {

		Object [][] data= new Object[4][2];

		data[0][0]="admin";
		data[0][1]="Admin123";

		data[1][0]="admin";
		data[1][1]="Admin12345";

		data[2][0]="adminaa";
		data[2][1]="Admin123";

		data[3][0]="admi";
		data[3][1]="Admi";

		return data;


	}
}