package TestNG;

import org.testng.annotations.*;

public class Annotaion2 {
	@BeforeSuite
	public void setproprety() {
		System.out.println("@beforesuite.....> setproperty");
	}
	
	@BeforeTest
	public void lanchbrowser() {
		System.out.println("@beforeTest...> Webdriver driver= new Chromedriver");
	}
	@BeforeClass
	public void url() {
		System.out.println("@beforeclass....> driver.get(url)");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("@beforemethod.....> login the app");
	}
	@Test
	public void test1() {
		System.out.println("@Test...> gettext()");
	}
	@Test
	public void test2() {
		System.out.println("@Test....> fb_logo");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("@aftermethod....> logout");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("@AfterClass...> close browser");
	}
	@AfterTest
	public void deletallcokies() {
		System.out.println("@AfterTest...> delete all cokise");
	}
	
	
	

}
