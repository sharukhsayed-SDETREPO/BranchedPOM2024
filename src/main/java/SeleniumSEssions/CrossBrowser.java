package SeleniumSEssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
static WebDriver driver;

	public static void main(String[] args) {
		
		String browser ="chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();// launch browser
			
		}
		
		else if (browser.equalsIgnoreCase("safari")) {
		
			driver =new SafariDriver();// launch browser no driver required for safari just allow ermission for automation
			
		}
		
		else if (browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); // no gecko installed in system
			driver =new FirefoxDriver();// launch browser
			
		} 
		
		else {
			System.out.println("Invalid broser name "+ browser);
		}
		
		
		driver.get("http://www.amazon.com");

		String title=driver.getTitle();
		
		System.out.println("Title is :" + title);

	}

}
