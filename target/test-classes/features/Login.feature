Feature: Application Login

Scenario: Home page default login
Given user is on landing page
When user logs into application with username jim and password 1234
Then Home page is populated
And payment cards "are" displayed

Scenario: Home page default login
Given user is on landing page
When user logs into application with username john and password 4321
Then Home page is populated
And payment cards "are not" displayed