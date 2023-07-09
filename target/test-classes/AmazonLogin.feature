Feature: To test the functionality of the Amazon webpage

Background:
#Given User has to launch the chrome browser

Scenario: To Check the login functionality of the Amazon login webpage
#Given User has to launch the chrome browser 
When User has to go the Amazon login page 
And User has to click Sign in button
And User has to enter email or mobile number
|bharath0612@gmail.com|bharath@gmail.com|998999993|
And User has to click Continue 
And User has to enter password
|bharath1234|Life34|room12|goodGuys123|
|chandini12|harri12|Life12|Haruve123|
|hai12|3rri12|4fe12|aryuve123|
And User has to click submit in button
#Then User has to close the Browser