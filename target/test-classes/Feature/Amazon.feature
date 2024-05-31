 Feature: User  Purchase a product


Scenario: LogIn with Valid Username And Password 

Given User Landed on the Amazonpage
When User Click SignIn Button 
And User Enter the UserName in Username field "mahasoundar@gmail.com"
And User Click the Continue Button
And User Enter the Password in Password field "12345678"
And User Click the SignIn Button to Navigate to next Page
Then User Landed on the Amazon HomePage

Scenario: User Search The Laptop And add toCart

When User Click the Search Box 
And User Enter the Laptop Name on Search Field "<Mobile>"
And User Click the Search Button And Navigate to the ProductPage
Then User Sucessfully Navigate to  Product Page  
When User Click the First Product
Then User Navigate the Particular ProductPage
When User Click AddtoCart Button
And User Click AddtoCart Button2  

Examples: 
    |Mobile|
    |Apple iPhone 15 Pro Max (1 TB)|
    |Samsung Galaxy Tab S9 FE 27.69 cm|


Scenario: Payment Process
When User Click the Cart Button
And User Click Pay to Process Button
And User click Use Address Button
And User Click Credit Card Button
And User Enter the Card Details 
And User Enter The Card Number "435657678"
And User Click the Submit Card Button


