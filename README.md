README: Automated Tests for NHSBSA Help with Health Costs Eligibility Checker

Project overview:

This project contains automated tests for verifying the eligibility checker on the health
NHSBSA Help with Health Costs application. The tests ensure a user in the UK can successfully navigate through the 
eligibility journey by answering  a series of questions and receiving an eligibility outcome. 

Test Scope 

The automated tests cover:
Cookie Banner functionality: Accepting the cookies 
Page Navigation: Ensuring Correct page transitions based on user input.
Form interaction: Entering a date of birth and selecting responses for eligibility questions.

Technologies Used 
Java with Selenium Webdriver for browser automation
Cucumber for Behaviour-Driven Development(BDD) testing 
JUnit for test execution
Maven for dependency management

Test Scenarios Implemented 
Cookie Acceptance
Verifying the user can accept cookies and preferences are stored

Navigating the Eligibility Checker
Starting from the start now page the user answers a series of questions.
Questions include location, age, partner status, benefits, health conditions and income details.
Users are navigated to the next pages based on their responses.
Users Enter a valid date of birth.
Eligibility results should be reached to ensure the tests are complete.

Running the Tests:
Run the command "mvn clean test" to run the full test suite.

Reports
Cucumber HTML reports will be generated in /target/cucumber-reports/.