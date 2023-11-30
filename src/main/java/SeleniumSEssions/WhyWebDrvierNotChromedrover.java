package SeleniumSEssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhyWebDrvierNotChromedrover {

	
	public static void main (String args []) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.iedriver().setup();	
		WebDriverManager.firefoxdriver().setup();
		 
		//why 
		WebDriver driver = new ChromeDriver(); //can be use to oint at  all the child class objects 
		// why not 
		
		ChromeDriver driver1 = new ChromeDriver(); // only for chrome driver
	}
}
