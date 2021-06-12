Feature: Login functionality of LeafTaps application

Background:
Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps/control/main'


Scenario Outline: Login with positive data
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: Login with negative data
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa123'
When Click on Login button
But Error message should be displayed


