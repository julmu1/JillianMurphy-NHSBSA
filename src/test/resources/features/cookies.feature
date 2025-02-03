Feature:Accepting cookies
  As a user I want to accept the cookies and my preference will be stored

  Scenario: Accepting cookies
    Given the user is on the start page
    When the user Accepts Cookies
    Then the cookie banner should disappear
