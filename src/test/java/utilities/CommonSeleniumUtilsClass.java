package utilities;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigurationReader;

public class CommonSeleniumUtilsClass extends Driver{
	 
	    public void clickWithJS(WebElement elementtoclick) {
	        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigurationReader.getProperty("seleniumtimeout")));
	      //  wait.until(ExpectedConditions.elementToBeClickable(elementtoclick));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementtoclick);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementtoclick);
	    }
	    public void waitForPresenceOfElementByCss(String css) {
	    	

	    	//github.com/KSuranov
	    	
	    }
	    public void waitForStaleElement(WebElement element) {
	        int i = 0;
	        while (i < 10) {
	            try {
	                element.isDisplayed();
	                break;
	            } catch (StaleElementReferenceException e) {
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e1) {
	                    e1.printStackTrace();
	                }
	                e.printStackTrace();
	                i++;
	            } catch (NoSuchElementException e) {
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e1) {
	                    e1.printStackTrace();
	                }
	                e.printStackTrace();
	                i++;
	            } catch (WebDriverException e) {
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e1) {
	                    e1.printStackTrace();
	                }
	                e.printStackTrace();
	                i++;
	            }
	        }
	    }
	    public boolean verifyElementIsNotPresent(String xpath) {
	        List<WebElement> elemetns = driver.findElements(By.xpath(xpath));
	        return elemetns.size() == 0;
	    }
	    public boolean verifyElementIsNotPresent(By by) {
	        
	    	//github.com/KSuranov
	    	return true;
	    	
	    }
	    public void scrollToElement(WebElement element) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	    public void hitEnterUsingRobot() {

	    	//@KSuranov
	    	
	    	
	    }
	    public boolean verifyAlertPresent() {
	        try {
	            driver.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException Ex) {
	            System.out.println("Alert is not presenet");
	        }
	        return false;
	    }
	    
}


