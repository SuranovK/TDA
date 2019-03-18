package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
	
	@Test
	public void validatingHomePage() {
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	assertEquals(actualTitle, "Online Stock Trading, Investing, Online Broker | TD Ameritrade");
	
}
	
	
	
	

}
