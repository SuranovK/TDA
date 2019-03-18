package pages;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tests.TestBase;


public class HomePage extends TestBase{
	//protected WebDriver driver; 
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "userid")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/button")
	public WebElement loginButton;

	@FindBy(xpath = "//input[@name='iwPreActions']")
	public WebElement searchBox;
	
	@FindBy(className="main-header-search-submit")
	public WebElement searchButton;

	
	
	public void login(String uid, String pwd) {
		userName.sendKeys(uid);
		password.sendKeys(pwd);
		loginButton.click();

}
	
	public void searchContext(String str) {
		searchBox.sendKeys(str);
		searchBox.sendKeys(Keys.ENTER);
		
		
	}

	}
