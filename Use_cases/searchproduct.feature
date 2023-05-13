Feature: Searching for product based on name

Background: The system has many products 
	Given that the admin is logged in 
	And these products in the system
		|name|type|price|amount|
| carpet | 4*4 | 20 |2 |
| carpet | 4*5 | 25 | 3 |
| cover | single | 20 | 1 | 
| cover | couple  |25 | 2 |
| carpet | 7*7 | 40 | 2 |
	And the admin loggs out 
	
	 

	
Scenario: Searching for product by name
Given  the admin is not  logged in
When the user search for the text "carpet"
Then the product with name " carpet" is found 


Scenario: Searching  when the admin is logged in 
	Given that the admin is logged in 
	When the user search for the text "cover" 
	Then the product with name "cover" is found



