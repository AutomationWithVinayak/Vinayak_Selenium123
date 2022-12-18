package TestNG;

import org.testng.annotations.Test;

public class TestNg_expected_Exceptions {
	
	
	@Test(expectedExceptions= NumberFormatException.class)
	public void test() {
		
		String a= "123Ab";
		int b=Integer.parseInt(a);
		System.out.println(b);
	}

}
