Feature: User selects which country they live in to start their eligibility journey

  Background:
    Given I am on the start page
    And I am on the live in page

    Scenario: I live in Northern Ireland
    When I select my country as Northern Ireland
    Then I will see the service not northern ireland page




#    Scenario Outline: validate the options for selecting country
#      When I choose <liveInRadioButton>
#      Then I will see <screen>
#      Examples:
#      |liveInRadioButton|screen                          |
#      |      England    | GP in scotland or wales        |
#      |      Wales      | GP in scotland or wales        |
#      |      Wales      | GP in scotland or wales        |
#      |      Wales      | service not in Northern Ireland|
# Given more time the journey would be improved by using the scenario outline method
# and adding multiple options for each page, to improve flow and reduce redundant code