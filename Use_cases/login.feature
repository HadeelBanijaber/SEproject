Feature: login
	Description:you can login if the username and password is true
Scenario: login
	Given the username is "amnaOth"
	And the password is "am123"
	Then login is done 
	And welcome 
	
Scenario:  Wrong login wrong pass
	Given the username is "amnaOth"
	And the password is "am133"
	Then login failed 
	And sorry
	
	Scenario:  Wrong login wrong usernam
	Given the username is "amnath"
	And the password is "am123"
	Then login failed 
	And sorry
	
	Scenario:  Wrong login wrong usernam and wrong pass
	Given the username is "amnath"
	And the password is "am133"
	Then login failed 
	And sorry	

