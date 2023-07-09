package stepDefinitionClass;

import java.util.List;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojoClass.MyntraPojoClass;

public class Myntra extends BaseClass{
	MyntraPojoClass p;
	@Given("user has to launch the browser")
	public void userHasToLaunchTheBrowser() {
		launchBrowser("chrome");
		   maxi();
	}

	@When("user has to navigate to Myntra page")
	public void userHasToNavigateToMyntraPage() {
		launchUrl("https://www.myntra.com/");
	}

	@When("user has to type the product name in search box")
	public void userHasToTypeTheProductNameInSearchBox(DataTable e) {
	    p=new MyntraPojoClass();
	    List<String> l = e.asList();
	    passText(l.get(1), p.getSearchField());
		
	}
	@When("user has to click search button")
	public void userHasToClickSearchButton() {
		p= new MyntraPojoClass();
		click(p.getSearchButton());
	    
	}

	@Then("user Close browser")
	public void userCloseBrowser() {
		
		 closeBrowser();
	   
	}


}
