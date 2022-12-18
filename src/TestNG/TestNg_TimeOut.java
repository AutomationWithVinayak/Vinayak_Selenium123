package TestNG;

import org.testng.annotations.Test;

public class TestNg_TimeOut {
	
	@Test(timeOut=3000)
	public void infiniteloop() {
		
		for(;;) {
			System.out.println("Hello");
		}
		
	}

}
