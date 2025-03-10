Feature: Eligibility for a single user in England

  As a 30 year old user, living in England, I want to complete the health with health costs,
  Eligibility check,
  So that I can find out if I qualify for help with NHS Costs

  Background:
    Given I am on the start page
    And I am on the live in page

  Scenario: Complete the checks
    When I select England as my Country
    And I select my GP practice as England
    And I select my dental practice as England
    When I enter a date of birth "01" "02" "1995"
    And I do not live with a partner
    And I do not claim benefits
    When I enter that I am not pregnant or given birth
    And I do not have an armed force related illness or diabetes
    And I say no to other medical conditions
    When I enter I have less than the amount in property
    Then I get the result I can get help "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/result" page

    #Note the steps could be further refined for the ticket, this is a representation of the journey





