package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import browserControl.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageObjects extends WebConnector {
	
	@Given("I am on Debenhams homepage")
	public void i_am_on_Debenhams_homepage() throws InterruptedException {
	    browser.get(baseUrl);
	    Thread.sleep(3000);
		
	}

	@When("I click on {string} link")
	public void i_click_on_link(String linkText) throws InterruptedException {
		
		browser.findElement(By.linkText(linkText)).click();
		Thread.sleep(3000);
	    
	}

	@Then("I should navigate to {string} page")
	public void i_should_navigate_to_page(String uri) {
		
		Assert.assertTrue(browser.getCurrentUrl().contains(uri));
	    
	}
	
}

