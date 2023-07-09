package stepDefinitionClass;

import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pojoClass.ICICpojoClass;

public class ICICBank extends BaseClass {

	ICICpojoClass p;

	@Given("User has to navigate to ICIC Bank Webpage in browser")
	public void userHasToNavigateToICICBankWebpageInBrowser() {
		launchUrl("https://www.icicibank.com/");
	}

	@When("User has to Click login button")
	public void userHasToClickLoginButton() {
		p = new ICICpojoClass();
		click(p.getLoginButton());
	}

	@When("User has to Click user ID field")
	public void userHasToClickUserIDField() {
		Actions a = new Actions(driver);
		p = new ICICpojoClass();
		a.moveToElement(p.getUserID1()).click().perform();
	}

	@When("user has to type User ID in userID field")
	public void userHasToTypeUserIDInUserIDField() {
		p = new ICICpojoClass();
		passText("1234", p.getUserID2());
		

	}

	@When("user had to type password in password field")
	public void userHadToTypePasswordInPasswordField() {
		p = new ICICpojoClass();
		passText("1234", p.getPass());
	}

	@When("user has to click LoginButton in page")
	public void userHasToClickLoginButtonInPage() {
		p = new ICICpojoClass();
		click(p.getSubmit());

	}

}
