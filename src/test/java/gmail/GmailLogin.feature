Feature: To validate the Functionality of the Gmail Webpage 
Scenario Outline: To validate the login function with samples of datas
Given User had to launch the brower and maximize chrome browser
When User had to Launch the gmail application in chrome browser
And User has to pass the data"<emailData>" in email Field 
And User has to click next
And User has to pass the data"<passwordData>" in passowrd field 
And User had to click button login 
Then user has to close the browser

Examples:
|emailData        |passwordData|
|bharath@gmail.com|1w34        |
|abc@gmail.com    |wer5        |
|not@gmail.com    |123         |
|Wire@gmail.com   |wer5        |
|Bou@gmail.com    |err5        |
|Cou@gmail.com    |123         |