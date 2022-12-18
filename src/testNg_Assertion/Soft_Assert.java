package testNg_Assertion;   
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void demo1() {
		
		softassert.assertEquals("viki","viki");
		System.out.println("viki");
		
		softassert.assertEquals("vik", "viki");
		System.out.println("vik");
		
		softassert.assertAll();
		
	}
	
	
	@Test
	public void demo2() {
		
		softassert.assertEquals("Ranjit", "sir");
		System.out.println("ranjitsir");
		
		softassert.assertTrue(false);
		softassert.assertEquals(true, false);
		softassert.assertEquals("lonar", "lon");
		
		System.out.println("pass");
		
		softassert.assertAll();
		
		
		
	}
	
	
	
	
	
	
	
	

}
