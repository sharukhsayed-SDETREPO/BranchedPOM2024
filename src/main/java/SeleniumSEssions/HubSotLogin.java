package SeleniumSEssions;

public class HubSotLogin {

	public static void main(String[] args) throws InterruptedException {
	String browser ="IE";
	String url ="https://app.hubspot.com/login";
		WebDriverFactory wf = new WebDriverFactory();
		
		wf.launchBrowser(browser);
		
		wf.launchurl(url);
	
		
		String title=wf.getageTitle();
		
		if (title.equalsIgnoreCase("HubSpot Login")) {
			System.out.println("Title is correct :"+ title);
		}
		
		else {
			System.out.println("incorrect title");
			
		}
		
		
		wf.closeBrowser();

	}

}
