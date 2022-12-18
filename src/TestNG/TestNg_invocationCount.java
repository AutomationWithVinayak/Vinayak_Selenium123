package TestNG;

import org.testng.annotations.Test;

public class TestNg_invocationCount {
	
	
	@Test(invocationCount=50)
	public void m1() {
		
		int a=10;      int  b= 20;      int c=a+b;
		System.out.println(c);
		
	}

}
