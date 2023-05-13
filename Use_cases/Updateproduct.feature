Feature: Update product
	Description:you can Update if the admin login
	
	

	
	
	
Scenario: Update missing product successfully
	Given admin logged in
	And  a product  name "cover" , type "single" , and the price "25", amount"7"
	When the product is Update missing from the system
	Then the product with name "cover" ,type "single" , and the price "25", amount"7" updated 
	 
	
Scenario: Update missing product and admin is not logged in
    Given  admin is not logged in
	And  a product  name "cover" , type "single" , and the price "25", amount"7"
	When the product is Update missing from the system
	Then the error messag missing "cant Update Missing because admin is not log in" is appear
	
Scenario: Updating up product successfully
	Given admin logged in
	And  a product  name "cover" , type "single" , and the price "25", amount"7"
	When the product is Updating up from the system
	Then the product with name "cover" ,type "single" , and the price "25", amount"7" updated 
	 
	
Scenario: Updating up product and admin is not logged in
    Given  admin is not logged in
	And  a product  name "cover" , type "single" , and the price "25", amount"7"
	When the product is Updating up from the system
	Then the error messag up "cant Updating Up because admin is not log in" is appear
	