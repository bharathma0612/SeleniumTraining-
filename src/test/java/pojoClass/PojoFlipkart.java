package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class PojoFlipkart extends BaseClass {
	
	public PojoFlipkart() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement otpButton;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getOtpButton() {
		return otpButton;
	}


}
