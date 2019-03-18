package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.ConfigurationReader;

public class SearchBoxTest extends TestBase{
	
	@Test
	public void validateSearchBox() {
		
	String searchText = ConfigurationReader.getProperty("searchtext");	
	HomePage hm = new HomePage(driver);
	hm.searchContext(searchText);
	
	String actualText = driver.findElement(By.xpath("//*[@id=\"1461360467286\"]/div/nav/h1")).getText();
	String expectedText = "Search Results";
	
	System.out.println(actualText);
	
	assertEquals(actualText, expectedText, "Validation failed");

	
	}

}
