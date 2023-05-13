Feature: Delete product
	Description:you can delete if the admin login
	
	

	
	
	
Scenario: delete product successfully
	Given the admin is logged in
	And there is a product  name "cover" , type "single" , and the price "17", amount"1"
	When the product is deleted from the system
	Then the product with name "cover" ,type "single" , and the price "17", amount"1" off the system
	 
	
Scenario: delete product and admin is not logged in
    Given  the admin is not logged in
	And there is a product  name "cover" , type "single" , and the price "20", amount"1"
	When the product is deleted from the system
	Then the error messag "cant delete because admin is not log in" is given
	
	