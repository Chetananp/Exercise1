Feature: VerifyHomepage

Background: 
Given I am on Furniture page


Scenario Outline: Verify links in Furniture page
When I click on "<linkText>" link
Then I should navigate to "<uri>"
Examples:
| linkText | uri |
| Sofas | sofas |
| Beds | beds |
| Armchairs | armchairs |