Feature: Testing datable keyword

Background: 
Given background given executed
When background when executed

Scenario: Create DataTable using Maps 

Given Users enter the details
|username  |Password     |mailid|     phone|
|samarthak|1234|sam@hotmail.com|7777|
|unkown|5656|xyz@unk.com|***|

When user click on the submit button

Then Details are saved


Scenario: Create DataTable using List

Given Users enter the details without columns
|samarthak|1234|sam@hotmail.com|7777|
|demo|234|demo@gmail.com|7070|

When user click on the submit button

Then Details are saved
