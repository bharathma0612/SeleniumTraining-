package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class MyntraPojoClass extends BaseClass {
	
	public MyntraPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	private WebElement searchField;
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement searchButton;
	
	

	public WebElement getSearchButton() {
		return searchButton;
	}



	public WebElement getSearchField() {
		return searchField;
	}

}
