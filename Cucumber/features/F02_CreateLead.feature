Feature: Create Lead functionality in LeafTaps application

#Background:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/control/main'

@functional
Scenario: Create Lead with manadatory informations

Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crmsfa link
#Then MyHomePage should be displayed
#When Click on Leads link
#Then CreateLead link should be displayed
#When Click on CreateLead link
#Then CreateLead form page should be displayed
#Given Enter the firstname as 'Hari'
#And Enter the lastname as 'R'
#And Enter the company name as 'TestLeaf'
#When Click on CreateLead button
#Then New Lead should be created