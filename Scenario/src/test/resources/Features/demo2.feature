Feature: feature to test login fucntionality

@Smoke
Scenario: check the login with valid credentials
Given user is on login page
When user enter username and password
And clicks on login button
Then user is navigated to home page

@Regression
Scenario: check the login with one invalid credentials
Given user is on login page
When user enter username and password
And clicks on login button
Then user should not be navigated to home page

@Smoke @skip_scenario
Scenario: check the login with invalid credentials
Given user is on login page
When user enter username and password
And clicks on login button
Then user should not be navigated to home page