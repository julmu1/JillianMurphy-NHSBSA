Feature: Eligibility Check journey for Northern Ireland

  As a user living in Northern Ireland, I want to complete the health with health costs,
  Eligibility check,
  So that I can find out if I qualify for help with NHS Costs

  Background:
    Given the user is on the start page

  Scenario: Complete the eligibility check journey
    When the user selects the start now button
    Then the user is redirected to the country page
    When the user selects Northern Ireland
    And clicks next button
    Then they should be redirected to the service not northern ireland "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/service-not-northern-ireland" page