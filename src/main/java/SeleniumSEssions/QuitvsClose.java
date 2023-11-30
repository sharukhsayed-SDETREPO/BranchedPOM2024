package SeleniumSEssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();// launch browser
		
		driver.get("http://www.amazon.com");

	String title=driver.getTitle();
	
	System.out.println("Title is :" + title);
 Thread.sleep(3000);
	driver.quit();
 //driver.close(); 
 
 
	
	System.out.println("Title should be null:"+ driver.getTitle());
	}
	
	


}
