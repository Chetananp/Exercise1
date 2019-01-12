Feature: Verify Search functionality


Scenario: Search for Tshirts
    Given I am on Debenhams homepage
    When I enter "T-shirts" search filed
       And I click on search button
    Then I should see search results for "T-shirts" 

    
Scenario Outline: Search for different Products
Given I am on Debenhams homepage
When I enter "<Item name>" search field
  And I click on search button
Then I should see search result for "<Item>"
Examples: 
	| Item name | Item     |
	| Dresses   | Dresses  |
	| Coats     | Coats    |
	| Lipstick  | Lipstick |
	| Shoes     | Shoes    |
	