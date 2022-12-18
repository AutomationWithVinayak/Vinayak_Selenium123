package TestNG;

import org.testng.annotations.Test;

public class DependOnMethod {

    @Test
	public void LoginPage() {
    
    	int i=1;
    	int div=i/0;
    	System.out.println(div);
		
	}
    @Test(dependsOnMethods="LoginPage")
	public void homepage() {

		System.out.println("homepage");
	}
    @Test(dependsOnMethods="LoginPage")
	public void secondpage() {

		System.out.println("secondpage");
	}

    @Test(dependsOnMethods="LoginPage")
	public void logoutpage() {

		System.out.println("logoutpage");
	}
    
    
    


}
