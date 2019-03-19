package com.tdameritrade.tests.homePageTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.tdameritrade.tests.TestBase;

public class HomePageTest extends TestBase{
	
	@Test(groups= {"smoke"}, priority = 1)
	public void validatingHomePage() {
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	assertEquals(actualTitle, "Online Stock Trading, Investing, Online Broker | TD Ameritrade");
	
}
	
	
	
	

}
