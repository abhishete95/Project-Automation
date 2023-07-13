Feature: Amazon Login Fuctionality

Background: User open application  successfully
Given user Launch browser with  "webdriver.chrome.driver"
Given user open application  as

@SmokeTest
Scenario: User login Application with valid credentials
When user navigate on sign in  button
When user click on sign in  button
When user enter "1234567890" as  username
When user click on continue  button
When user enter "1234567890" as  password
When user click on last sign in  button
Then application shows Login  successfully