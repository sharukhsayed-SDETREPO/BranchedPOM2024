package SeleniumSEssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class WebDriverFactory {

	
	public WebDriver driver;
	/**
	 * This will launch the browser
	 * @param browser
	 * @return driver
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("Browser name is :"+ browser);
		
		if(browser.equalsIgnoreCase("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else	if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			
		}
		else	if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		else	if(browser.equalsIgnoreCase("IE")) {
			
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			
			
		}
		
	else	if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
	return driver;	
	}
	
	/*
	 * 
	 * launch url
	 */
	
	public void launchurl(String url) {
		driver.navigate().to(url);;
	}
	
	/*
	 * 
	 * get age title
	 * @return title
	 */
	public String  getageTitle( ) {
		return  driver.getTitle();
	}
	
	/*
	 * 
	 * get URL
	 * @return URL
	 */
	public String  getCurrenturl( ) {
		return  driver.getCurrentUrl();
	}
	
	/*
	 * 
	 * Close browser
	 */
	public void  closeBrowser( ) {
		  driver.quit();
	}
	
	
	
}
