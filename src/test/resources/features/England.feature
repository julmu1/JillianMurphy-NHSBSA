Feature: Eligibility Check journey for England

  As a 45 year old user living in England, and has a partner,
  I want to complete the health with health costs,
  Eligibility check,
  So that I can find out if I qualify for help with NHS Costs

  Background:
    Given the user is on the start page

  Scenario: Complete the eligibility check journey
    When the user selects the start now button
    Then the user is redirected to the country page

    When the user selects England
    And clicks next button
    Then they should see the gp practice page

    When the user enters yes to scotland or wales
    And clicks next button

    Then they should see the dental practice page
    When they select England
    And clicks next button
    Then they should see the date of birth page

    When they enter a valid date of birth
    And clicks next button
    Then they should see the lives with a partner page

    When they select yes to lives with a partner
    And clicks next button
    Then they should see the claim benefits page

    When they enter yes to claim benefits
    And clicks next button
    Then they should see the paid universal credit page

    When they select yes, we receive universal credit payments
    And clicks next button
    Then they should see the universal credit claim page

    When they enter yes to universal credit claim page
    And clicks next button
    Then they should see the universal take home credit home pay page

    When they select yes to combined income
    And clicks next button
    Then the user should be on the "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/result-claiming-qualifying-universal-credit" page

    #Note the steps would need to be refined for the ticket, this is a representation an end to end journey











