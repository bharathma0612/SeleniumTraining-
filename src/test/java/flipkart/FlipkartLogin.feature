Feature: To validate the Functionality of Flipkart login page 
Scenario: To validate the login funcationality of Flipkart application
Given User has to launch the chrome browser and maximize
When User has to navigate to the Flipkart Webpage in browser
And user has to give email or mobile no in username field 
|email1|mobile|email3|
|bharath@gmail.com|12345|bharath@gmail.com|
|bharat23h@gmail.com|12345|bhara45th@gmail.com|
|bhar33ath@gmail.com|12345|bharty6ath@gmail.com|
|bharaterh@gmail.com|12345|bhar4rfgath@gmail.com|


And user has to click send otp
Then Close the chrome browser