Feature: Eligibility Check journey for Scotland

  As a 16 year old user, living in Scotland, I want to complete the health with health costs,
  Eligibility check,
  So that I can find out if I qualify for help with NHS Costs

  Background:
    Given the user is on the start page

  Scenario: Complete the eligibility check journey
    When the user selects the start now button
    Then the user is redirected to the country page

    When the user selects Scotland
    And clicks next button
    Then the user should be on "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/live-in-highlands" page
    When the user selects yes to living in the Highlands
    And clicks next button
    Then they should see the dental practice page
    When the user selects I am not registered with a dental practice
    And clicks next button
    Then they should see the date of birth page
    When they enter a valid date of birth which is 16
    Then they will see full time education page
    When the user enters yes to full time education page
    Then they will see results full time education "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/result-full-time-education" page

    #Note the steps would need to be refined for the ticket, this is a representation of the journey








