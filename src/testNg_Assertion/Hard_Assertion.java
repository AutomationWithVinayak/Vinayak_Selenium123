package testNg_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Hard_Assertion {

	@Test
	public void demotest() {

     Assert.assertTrue(true);
     System.out.println("False");
     
     Assert.assertEquals("Welcome","elcome");
    System.out.println("Hello");
		
     Assert.assertEquals("Selenium", "Selenium");
		System.out.println("Selenium");
	}
	
	@Test
	public void demoTest1() {
		
		Assert.assertEquals("viki", "viki");
		
		Assert.assertTrue(true);
		
		System.out.println("successfully passed");
	}


}
