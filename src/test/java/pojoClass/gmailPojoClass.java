package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class gmailPojoClass extends BaseClass {

	public gmailPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//input[@id='identifierId']"))
	private WebElement email;

	@FindBy(xpath = ("(//span[@jsname='V67aGc'])[2]"))
	private WebElement nextButton;

	@FindBy(xpath = ("//input[@type='password']"))
	private WebElement password;

	@FindBy(xpath = ("(//span[@jsname='V67aGc'])[2]"))
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
