Feature: update customer
  I want to update customer

  
  Scenario: update phone when admin is login
    Given admin is loggin 
    And  i want to update customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When update phone number for customer
    Then update done 
    
    
    Scenario: update city when admin is login
    Given admin is loggin 
    And  i want to update customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When update city
    Then update done 
    
    

   Scenario: update when admin is not login
    Given admin is not loggin 
    And  i want to update customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When update customer
    Then the "admin must be login " appear