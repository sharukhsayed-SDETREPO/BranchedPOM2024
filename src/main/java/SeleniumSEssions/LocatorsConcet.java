package SeleniumSEssions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcet {
    
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.iedriver().setup();
	 driver = new InternetExplorerDriver();
		
		
		driver.get("https://app.hubspot.com/login");
		
		//Create a WebElement then act on it
		
		//1st method -lengthy
		
		driver.findElement(By.id("username")).sendKeys("ABC@gmail.com");;
		driver.findElement(By.id("password")).sendKeys("ABC@gmail.com");;
		driver.findElement(By.id("loginBtn")).click();
		
		//2 method
	 WebElement username= driver.findElement(By.id("username"));
	 WebElement password= driver.findElement(By.id("password"));
	 WebElement loginbtn= driver.findElement(By.id("loginBtn"));
	 
	 username.sendKeys("ABC@gmail.com");;
	 password.sendKeys("ABC@gmail.com");;
	 loginbtn.click();
	 
	 
	 //3 Using  bhy locators
	 
	 By usernameBY= By.id("username");
	 By passwordBY= By.id("password");
	 By loginbtnBY= By.id("loginbtn");
	 
	 
	 driver.findElement(usernameBY).sendKeys("ABC@gmail.com");;
	 driver.findElement(passwordBY).sendKeys("ABC@gmail.com");;
	 driver.findElement(loginbtnBY).click();
	 
		//4 reusable method+ by locator
	 getElement(usernameBY).sendKeys("ABC@gmail.com");;
	 getElement(passwordBY).sendKeys("ABC@gmail.com");;
	 getElement(loginbtnBY).click();
	 
	//5 reusable method+ by locator+actions
		doSendKeys(usernameBY, "Test@gmail.com");
		doSendKeys(passwordBY, "abesfs");;
		doClick(loginbtnBY);
	 
	}

	
	/**
	 * Method to return WebElement
	 * @param locator
	 * @return webElement
	 */
	
	public static WebElement getElement(By locator) {
		  return driver.findElement(locator);
    
	}
	
	/**
	 * method to send keys 
	 * @param locator,value
	 */
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);;
	}
	
	/**
	 * method to click
	 * @param click
	 */
	public static void doClick(By locator) {
		getElement(locator).click();;;
	}
	

}
