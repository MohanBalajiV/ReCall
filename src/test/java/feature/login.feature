Feature: Login with LeafTaps Automation

Background: Login
Given Launch the browser
And Load the URL
And Maximize the browser

@Login
Scenario: Login
And Enter the Username as Demosalesmanager
And Enter the Password as crmsfa
And Click on Login button

Scenario Outline: Create Lead
And Click crmsfa
And Click Leads
And Click Create Lead
And Enter the Company Name as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
When Click on CreateLead button
Then VerifyTitle
Then Close Browser


Examples:
|cname|fname|lname|
|testleaf|test|123|



