package Hooks;

import java.io.IOException;

import baseClass.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LaunchAndCloseBrowser extends BaseClass {
	
	@Before
	public void LaunchBrowser() {
		launchBrowser("chrome");
		maxi();

	}
	@After(value="@ss")
	public void TakeScreenShot() throws IOException {
		System.out.println("login page Screenshot");
		screenshot("C:\\cucumber\\Cucumber\\ScreenShot\\ss.png");

	}
	
	@After
	public void CloseBrowser() {
	closeBrowser();
	} 
	
	

}
