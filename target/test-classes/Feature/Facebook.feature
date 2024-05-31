Feature: Facebooklogin


Scenario: User Login Facebook With Username and Password

Given User Landed The Facebook Page
When User Enter The Username In Username Field "<username>"
And User Enter The Password In Password Field "<password>"
And User Click The Login button
Then User Can Navigate To The Facebook Home Page

Examples:
   |username|password| 
   |maha|12345|
   |ruthu|4567|
   |sai|7645|
   |soundar|87665|