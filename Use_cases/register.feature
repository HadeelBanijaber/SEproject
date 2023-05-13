Feature: Register User 
	register a user to the system


Scenario: Register a User successfully
 	Given that admin login 
 	And there is a user with name "Razan samaneh", username "razansam", password "razan123", phone "0569071035", and city "Nablus"
 	When the Admin registers the user 
 	Then the user with name "Razan samaneh", username "razansam", password "razan123", phone "0569071035", and city "Nablus" added
 	
Scenario: Register a User when admin logout
	Given that the admin not login
 	And there is a user with name "Razan samaneh", username "razansam", password "razan123", phone "0569071035", and city "Nablus"
 	When the Admin registers the user 
	Then the error message "Admin login required" is given
	

Scenario: Register a User that is already registered
	Given that admin login 
 	And there is a user with  name "Razan samaneh", username "razansam", password "razan123", phone "0569071035", and city "Nablus"
	And the user is already registered
 	When the Admin registers the user 
	Then the error message "This user is already registered" is given