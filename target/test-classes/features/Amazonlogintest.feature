Feature: Amazon login feature
Scenario: Sucessful login with vaild Credentials
Given User launch chrome browser
When User opens url
|http://www.amazon.in|
When User enters email and password 
|9492257477|Surendra@577|
Then Verify the page title
