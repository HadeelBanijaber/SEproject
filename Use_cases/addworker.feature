Feature: Add worker
       Descreption:Add worker not exist
       Actors:User
       
Background: worker
 Given These are the worker
     |w_id|w_name|w_specialty|w_phone|password |city     |bill|
	 |1    |Ahmad  |cover        |05992368|ahmad123 |nablus   |80  |
	 |2    |Adam   |carpet           |05992368|adam123  |nablus   |100 |
	 |3    |Bassam |everything        |05996899|bassam123|jerusalem|150 |
       
Scenario: Successfully add
 	Given that the user is logged in
 	And  the user want to add worker with ID "4" , and name "Sameh" , and w_specialty "Nerves" , and w_phone "05987658", and password "Smsm" ,and city "Jenin" ,and bill "200" 
 	When the worker is not exist before
 	Then the worker added
 	

