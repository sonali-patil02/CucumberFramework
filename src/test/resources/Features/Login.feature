Feature: login functionality



Scenario: valid login
Given user should be on login page
When user enters valid credentials
And click on login button
Then user should be on home page
And user can see logout option

