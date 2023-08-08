Feature: feature to test the Aigis Web Application login functionality

Scenario: validate login is working with correct credentials

Given browser is opened
When user on the search field
And user enters the application URL
And hits enter
Then user is logged in to the application
