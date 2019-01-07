package stepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;

import browserControl.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageObjects extends WebConnector {
	 
	//Locators
	
	private String logo="//div[@id='mainHeader']/a[2]";
	
	
	//Step Definitions
	
	@Given("I am on Debenhams homepage")
	public void i_am_on_Debenhams_homepage() throws InterruptedException {
	     
		browser.get(baseUrl);
		Thread.sleep(3000);	
	}
	
	@Then("I should see {string} title")
	public void i_should_see_title(String expectedTitle) {
	    
		Assert.assertEquals(expectedTitle, browser.getTitle());
		
	}
	
	@When("I click on logo")
	public void i_click_on_logo() throws InterruptedException {
	 browser.findElement(By.xpath(logo)).click();
	 Thread.sleep(3000);
	   
	}

	@Then("I should navigate to homepage")
	public void i_should_navigate_to_homepage() {
		
		Assert.assertEquals(baseUrl +'/', browser.getCurrentUrl());
	    
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
