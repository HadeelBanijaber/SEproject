Feature: add product
	Description:you can add if the admin login
	
	

	
	
	
Scenario: add product successfully
	Given that the admin is logged in
	And there is a product with name "cover" , type "single" , and the price "20", amount "2"
	When the product is added to the system
	Then the product with name "cover" ,type "single" , and the price "20", amount "2" inside the system
	 
	
Scenario: add product and admin is not logged in
    Given that the admin is not logged in
	And there is a product with name "cover" , type "single" , and the price "20", amount "2"
	When the product is added to the system
	Then the error message "cant add because admin is not log in" is given