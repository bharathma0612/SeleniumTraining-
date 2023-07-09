package stepDefinitionClass;

import java.util.List;

import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojoClass.pojoAmazon;

public class AmazonLogin extends BaseClass {
	pojoAmazon p;
	/*@Given("User has to launch the chrome browser")
	public void userHasToLaunchTheChromeBrowser() {
		
		 launchBrowser("chrome");
		   maxi();
	}*/

	@When("User has to go the Amazon login page")
	public void userHasToGoTheAmazonLoginPage() {
		 launchUrl("https://www.amazon.in/");
	}

	@When("User has to click Sign in button")
	public void userHasToClickSignInButton() {
		p=new pojoAmazon();
		Actions a= new Actions(driver);
		a.moveToElement(p.getHellosignin()).perform();
		click(p.getSignin());
	}

	@When("User has to enter email or mobile number")
	public void userHasToEnterEmailOrMobileNumber(DataTable e) {
		p=new pojoAmazon();
		List<String> l = e.asList();
		passText(l.get(0), p.getUsername());
	}

	@When("User has to click Continue")
	public void userHasToClickContinue() {
		p=new pojoAmazon();
		click(p.getCont());
	}

	@When("User has to enter password")
	public void userHasToEnterPassword(DataTable e) {
		p=new pojoAmazon();
		List<List<String>> l = e.asLists();
		passText(l.get(1).get(1), p.getPassword());
	}

	@When("User has to click submit in button")
	public void userHasToClickSubmitInButton() {
		p=new pojoAmazon();
		click(p.getSubmit());
	}

	/*@Then("User has to close the Browser")
	public void userHasToCloseTheBrowser() {
		 closeBrowser();
	} */

}
