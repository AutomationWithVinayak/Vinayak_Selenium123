package TestNG;

import org.testng.annotations.*;

public class TestNg_Annotations {
	
	// PreConditions annotaions Start with @Before
	
	//PreCondition annotations  - Starts with @Before
		@BeforeSuite
		public void setup()
		{
			System.out.println("@BeforeSuite---->set up system property for chrome");
		}
		
		@BeforeTest
		public void LaunchBrowser()
		{
			System.out.println("@BeforeTest------>Launch browser");
		}
		
		@BeforeClass
		public void EnterURL()
		{
			System.out.println("@BeforeClass----->Enter URL in browser");
		}
		
		@BeforeMethod
		public void Login()
		{
			System.out.println("@BeforeMethod---->Login to the application");
		}
		
		// TestClass - Starts with @Test
		@Test
		public void googleTitleTest()
		{
			System.out.println("@Test------>Google Title test");
		}
		
		@Test
		public void googleLogoTest()
		{
			System.out.println("@Test----->Google Logo test");
		}
		
		// Postcondition - Starts with @After
		@AfterMethod
		public void Logout()
		{
			System.out.println("@AfterMethod---->Log out to application");
		}
		
		@AfterClass
		public void closeBrowser()
		{
			System.out.println("@Afterclass----->Close the browser");
		}
		
		@AfterTest
		public void deleteAllcookies()
		{
			System.out.println("@AfterTest---->Delete all cookies");
		}
	
	
}
