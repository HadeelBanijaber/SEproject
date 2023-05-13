Feature: Schedule 
        Description: all customer who book 
        
     Background: visited
Given these are bookings 
     |  id |  w_id |  bookdate    |  booktime   |  Bill |
     | 123 |    3   |  12-3-2022   |  12:30      |  150  |
     | 785 |    1   |  19-2-2022   |  6:00       |  80   |
     | 444 |    1   |  19-2-2022   |  4:00       |  80   |																		
     | 123 |    2   |  28-2-2022   |  1:00       |  100  |   
        
 Scenario: On time
 Given there is the customer with ID "123"
 And the customer come in time where Previously selected
 When the customer pay his bill
 Then the booking delete from Schedule table
 

  
  
  Scenario: no comming
  Given there is the customer with ID "785"
  And the customer not comming in his booktime
  When the bookdate has passed 
  Then the booking will deleted