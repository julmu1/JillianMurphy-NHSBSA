Feature:Accepting cookies

  Scenario: Accepting cookies
    Given the user is on the start page
    When the user Accepts Cookies
    Then the cookie banner should disappear
