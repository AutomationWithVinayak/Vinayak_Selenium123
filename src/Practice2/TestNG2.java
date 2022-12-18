package Practice2;
import org.testng.annotations.*;

public class TestNG2 {
	
	
	// annotaions
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite....> setup property");
	}
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("@BeforeTest.....> Launch the browser");
	}
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("@BeforeClass.....> Enter URL driver.get()");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		
		System.out.println("@BeforeMethod.....> Login The Application");
		
	}
	
	@Test
	public void GoogleTitleTest() {
		
		System.out.println("@Test.....>  Gooogle Title Test");
		
	}
	
	@Test
	public void GoogleLogoTest() {
		
		System.out.println("@Test......> Google Logo Test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		
	System.out.println("AfterMethod.....>  LogOut");	
		
	}

	
	@AfterClass
	
		public void AfterClass() {
			System.out.println("@AfterClass...>  CloseBrowser");
		}
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("@AfterTest.....>  Delete All Cockies");
	}
	
	
	
	
		
	}
	
	


