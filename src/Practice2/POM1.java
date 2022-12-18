package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM1 {
	
	
	@FindBy(id="userid") private WebElement userid;
	@FindBy(id="password") private WebElement pass;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement button;
	@FindBy(xpath="//header[@class=\"header text-center\"]//a//img") private WebElement logo;
	
	
	public POM1 (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@Test(priority=1,invocationCount=2,enabled=true)
	public void Logo() {
		
		Assert.assertEquals(logo.isDisplayed(), true);
		System.out.println("logo is display");
	}
	
	
	
	@Test(priority=2,dependsOnMethods="Logo")
	public void enter_userid(String UN) {
		
		userid.sendKeys(UN);
		
	}
	
	@Test(priority=3,dependsOnMethods="enter_userid")
	public void enter_pass(String PWD) {
		
		pass.sendKeys(PWD);
	}
	
	@Test(priority=4,dependsOnMethods="enter_pass")
	public void ClickContinueButton() {
		
		button.click();
	}
	

}
