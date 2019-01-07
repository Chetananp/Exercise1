Feature: Verify home page


Background: 
Given I am on Debenhams homepage


Scenario: Verify home page title
Then I should see "Debenhams UK - Fashion, Beauty, Gifts, Furniture & Electricals" title


Scenario: Verify that clicking on logo is redirected to homepage 
When I click on logo
Then I should navigate to homepage


Scenario: Verify that the Women page link is working
When I click on "Women" link
Then I should navigate to "women" page


Scenario Outline: Verify the header links in homepage
When I click on "<linkText>" link
Then I should navigate to "<uri>" page
Examples:
   | linkText | uri     |
   | Women    | women   |
   | Lingerie | lingerie|
   | Beauty   | beauty  |
   
   




