package browserControl;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OpenCloseBrowser extends WebConnector{

	
@Before
	
	public void  openBrowser() {
		
		if(browserType.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "../Exercise3/src/test/java/resources/chromedriver.exe");
			
			browser = new ChromeDriver();
			
		} else if(browserType.equals("Firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "../Exercise3/src/test/java/resources/chromedriver.exe");
			browser = new FirefoxDriver();
			
		}
		
		browser.manage().window().maximize();	
	}
	
	@After
	
	public void closeBrowser() {
		
		browser.close();
	}
}
