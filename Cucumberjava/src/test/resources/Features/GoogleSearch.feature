Feature: feature to test google search functionality

  Scenario: Check google search is working or not
    Given browser is open
    And user is on google search page
    When user enter text is google search tab
    And hits the enter button
    Then user is navigated to search results
