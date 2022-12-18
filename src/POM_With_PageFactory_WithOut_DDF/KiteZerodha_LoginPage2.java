package POM_With_PageFactory_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodha_LoginPage2 {
	
	
	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement ContinueButton;
	
	public KiteZerodha_LoginPage2(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPin() {
		
		Pin.sendKeys("141611");
	}
	public void ClickOnContinueButton() {
		
		ContinueButton.click();
		
	}

}
