Feature: Eligibility Check journey for Wales

  As a user living in Wales, I want to complete the health with health costs,
  Eligibility check,
  So that I can find out if I qualify for help with NHS Costs

  Background:
    Given the user is on the start page

  Scenario: Complete the eligibility check journey
    When the user selects the start now button
    Then the user is redirected to the country page
    When the user selects Wales
    And clicks next button
    Then they should see the gp practice page
    When the user enters no to scotland or wales
    And clicks next button

    Then they should see the dental practice page
    When they select Wales
    And clicks next button
    When they enter a valid date of birth which is over 100
    Then they should see the lives with a partner page

    When they select no to lives with a partner
    And clicks next button
    Then they should see the claim benefits page

