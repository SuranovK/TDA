package com.tdameritrade.tests.loginTest;

import org.testng.annotations.Test;

import com.tdameritrade.pages.HomePage;
import com.tdameritrade.tests.TestBase;

import utilities.ConfigurationReader;

public class LoginFunctionalityTest extends TestBase{
	
	@Test(groups= {"smoke"}, priority = 2)
	public void loginWithValidCredentials() {
		String username = ConfigurationReader.getProperty("validusername");
		String password = ConfigurationReader.getProperty("validpassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}


	@Test(groups= {"security"}, priority = 1)
	public void loginWithInvalidCredentials() {
		String username = ConfigurationReader.getProperty("invalidusername");
		String password = ConfigurationReader.getProperty("invalidpassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}


	@Test(groups= {"security"}, priority = 2)
	public void loginWithEmptyData() {
		String username = ConfigurationReader.getProperty("emptyusername");
		String password = ConfigurationReader.getProperty("emptypassword");
		
		HomePage homePage = new HomePage(driver);
		homePage.login(username, password);
		System.out.println(driver.getTitle());
		
	}

	
}
