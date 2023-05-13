Feature: add customer
  I want to add a new customer

  
  Scenario: add when admin is login
    Given admin is login 
    And  i want to add customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When add customer
    Then add done 
    

   Scenario: add when admin is not login
    Given admin is not login 
    And  i want to add customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When add customer
    Then the "admin must be login " appear