package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailibaleReport {
	
	@Test
	public void GoogleTitle() {
		
		Reporter.log("Running test Case1",true);
		System.out.println("@Test  google title test");
	}
	
	@Test
	public void SearchText() {
		
		Reporter.log("Running Test Case2", true);
		System.out.println("@Test  Search Text");
	}
	
	
	

}
