Feature: FaceBook Login with Vaild Credentials
Scenario: Sucessfully login with vaild credentials
Given User launch Chrome Browser
When User Open url
|https://www.facebook.com/|
When User enter email and password
|surendravenkat5@gmail.com|Surendra@577|
Then Verfiy the page title