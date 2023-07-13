Feature: Add To Cart Fuctionality

Background: User login Application successfuly
Given user Launch browser with  "webdriver.chrome.driver"
Given user open application  as
When user navigate on sign in  button
When user click on sign in  button
When user enter "1234567890" as  username
When user click on continue  button
When user enter "1234567890" as  password
When user click on last sign in  button

@RegressionTest
Scenario: User Add to card product
When user click on All button
When user click on Fire TV
When user click on Fire Tv Cube
When user click on Add to Cart button
Then Application Shows product Add to cart successfully
