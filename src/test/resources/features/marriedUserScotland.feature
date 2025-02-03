Feature: Eligibility for a married user in Scotland

  As a married person in Scotland,
  I am 30, I am not pregnant and I do not claim benefits,
  I want to know what help I can get with NHS costs


  Background:
    Given I am on the start page
    And I am on the live in page

  Scenario: Complete the checks
    When I select Scotland as my Country
    And I select living in the Highlands
    And I select my dental practice as England
    When I enter a date of birth "01" "02" "1995"
    And I do live with a partner
    And I do not claim benefits
    When I enter that I am not pregnant or given birth
    And I do not have an armed forces related illness
    And I do not live in a care home
    When I enter I have less than the amount in property
    Then I get the result I can get help "https://check-for-help-paying-nhs-costs.nhsbsa.nhs.uk/result" page

    #Note the steps could be further refined for the ticket, this is a representation of an end to end journey

