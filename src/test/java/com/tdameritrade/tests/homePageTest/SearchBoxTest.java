package com.tdameritrade.tests.homePageTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
import com.tdameritrade.pages.HomePage;
import com.tdameritrade.tests.TestBase;

import utilities.ConfigurationReader;

public class SearchBoxTest extends TestBase{
	
	//@Test 
	public void validateSearchBox() {
		
	String searchText = ConfigurationReader.getProperty("searchtext");	
	HomePage hm = new HomePage(driver);
	hm.searchBoxFunction(searchText);
	
	String actualText = driver.findElement(By.xpath("//*[@id=\"1461360467286\"]/div/nav/h1")).getText();
	String expectedText = "Search Results";
	
	System.out.println(actualText);
	
	assertEquals(actualText, expectedText, "Validation failed");

	
	}
	
	@Test
	public void validatingSearchBoxWithEmptyInput() {
		
		HomePage hm = new HomePage(driver);
		assertTrue(hm.searchButton.isEnabled());
		System.out.println("Search Button is enable and can be clickable even seacrh box is empty");
		
		hm.searchButton.click();
		String searchResulMsg = hm.searchResult.getText();	
		assertEquals(searchResulMsg, searchResulMsg + 1, "Even the user does not enter data, it returns search result ");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Search Results | TD Ameritrade";
		
		

		
	}

}
