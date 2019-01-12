Feature: Verify homepage


Background: 
Given I am on Debenhams homepage

@Select
Scenario Outline: Verify the  all links in homepage
When I click on "<linkText>" link
Then I should navigate to "<uri>" page
Examples:
   | linkText | uri     |
      | Shop now | sale |
      
      

