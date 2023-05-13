Feature: report 



Scenario: print a list of customer
Given Admin is login 
When admin enters customer columns 
|name|user_name|pass|phone_number|city|
|Hadeel|Hadeel@|had123|0599382019|Nablus|
|Suha|Suha12|Suha123|0598112331|Tulkarm|
|Amnah|Amnah_12|Amnah123|0594424311|Ramallah|
|Reem|Reem@1|Reem123|0592114477|Ghaza|
|Ahmad|Ahmad_76|Ahmad123|0598577359|jenin|
Then print data of customer



Scenario: print a list of product
Given Admin is login 
When admin enters product columns 
|name|type|price|amount|
| carpet | 4*4 | 20 |2 |
| carpet | 4*5 | 25 | 3 |
| cover | single | 20 | 1 | 
| cover | couple  |25 | 2 |
| carpet | 7*7 | 40 | 2 |
Then print data of product
