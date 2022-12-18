package POM_With_PageFactory_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodha_LoginPage1 {
	
	//Regular class means main method not present in  // POM class
	
	// First :-  Decleare the variable globaly with access Leval Private  and use @FindBy Annotation
	
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement LoginButton;
	
	
	// second :- initilazie within a constuctor with access Level Public 
	
	public KiteZerodha_LoginPage1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
		
	
	
	// three :- usage Utilize within a method with access level public 	
	
      
	public void EnterUserId() {
		
		UserId.sendKeys("JAJ956");
		
	}
	
	public void EnterPassword() {
		
		Password.sendKeys("Sidheshwar");
		
	}
	
	public void ClickOnLoginButton() {
		
		LoginButton.click();
		
	}
	
	

}
