package utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigurationReader;

public class CommonSeleniumUtilsClass extends Driver{
	 public void switchToWindowByTitle(String title) {
	    	
	        Set<String> windows = driver.getWindowHandles();
	        System.out.println("Amount of windows that are currently present :: " + windows.size());
	        for (String window : windows) {
	            driver.switchTo().window(window);
	            if (driver.getTitle().startsWith(title) || driver.getTitle().equalsIgnoreCase(title)) {
	                break;
	            } else {
	                continue;
	            }
	        }
	    }
	    public void clickWithJS(WebElement elementtoclick) {
	        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(ConfigurationReader.getProperty("seleniumtimeout")));
	      //  wait.until(ExpectedConditions.elementToBeClickable(elementtoclick));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementtoclick);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementtoclick);
	    }
	    public void waitForPresenceOfElementByCss(String css) {
	    	

	    	//github.com/KSuranov
	    	
	          }
	    public void waitForVissibilityOfElement(WebElement element) {
	    	

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


