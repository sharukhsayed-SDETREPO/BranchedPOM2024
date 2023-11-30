 package SeleniumSEssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMtest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();// launch browser
		
		driver.get("http://www.amazon.com");

	String title=driver.getTitle();
	
	System.out.println("Title is :" + title);
	driver.quit();
	}

}
