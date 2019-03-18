package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.ConfigurationReader;

public class LoginFunctionalityTest extends TestBase{
	
	@Test
	public void loginWithValidCredentials() {
		String username = ConfigurationReader.getProperty("validusername");
		String password = ConfigurationReader.getProperty("validpassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}


	@Test
	public void loginWithInvalidCredentials() {
		String username = ConfigurationReader.getProperty("invalidusername");
		String password = ConfigurationReader.getProperty("invalidpassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}


	@Test
	public void loginWithEmptyData() {
		String username = ConfigurationReader.getProperty("emptyusername");
		String password = ConfigurationReader.getProperty("emptypassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}

	
}
