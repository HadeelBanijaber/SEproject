
Feature: delete customer
  I want to delete customer for some reason

  
   Scenario: delete when admin is login
    Given admin is loginn 
    And  i want to delete customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When delete customer
    Then delete done 
    

   Scenario: delete when admin is not login
    Given admin is not loginn
    And  i want to delete customer with name="hadeel",phone="004594688",id="17",and city="Nablus"
    When delete customer
    Then the "admin must be login " printf on screen 