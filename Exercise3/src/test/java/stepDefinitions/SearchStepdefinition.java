package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import browserControl.WebConnector;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdefinition {
	
	public class SearchStepDefiniton extends WebConnector{
		//Locators
		private String searchField ="//input[@id='searchSuggestControlDesktop']";
	    private String searchButton = "//button[@class='main-search-button']";
		
		
		//StepDefiniton
		@When("I enter {string} search filed")
		public void i_enter_search_filed(String Text) {
			 browser.findElement(By.xpath(searchField)).sendKeys(Text);
		}

		@When("I click on search button")
		public void i_click_on_search_button() throws InterruptedException {
			browser.findElement(By.xpath(searchButton)).click();
			Thread.sleep(3000);
		}

		@Then("I should see search results for {string}")
		public void i_should_see_search_results_for(String searchText) {
		    Assert.assertTrue(browser.getCurrentUrl().contains(searchText));
		}
	    
		
		//Searching different items
		
		@When("I enter {string} search field")
		public void i_enter_search_field(String Item) {
			browser.findElement(By.xpath(searchField)).sendKeys(Item);
		    
		}

		@Then("I should see search result for {string}")
		public void i_should_see_search_result_for(String Item) {
		Assert.assertTrue(browser.getCurrentUrl().contains(Item));
		   
				   
		}
	}
}