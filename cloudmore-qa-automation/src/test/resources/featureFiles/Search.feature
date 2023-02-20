# Part B (UI test automation) : Question 2
# Search by “Azure” and take a screenshot on a search result page for mobile and desktop size screens.
# In case search results have less than 3 items in the list, the test should fail

@ui @QuestionTwo @assignment
Feature: Test Search Page page for mobile and desktop size screens with number of items in the list

  Scenario Outline: Verify Search Results have more than 3 items in the list
    Given User direct to the Home Page
    Then Verify the HomePage availability
    And User Accepts the Cookie Consent
    When Navigate to "Search" page from home Page
    Then Verify the Search Page availability
    When User set the Web Page resolution into "<DEVICE>" size
    When User entered "<SEARCH_VALUE>" as search keyword on the search text field
    And  User click the search button
    Then Verify that the search results page is available
    And Verifying the Search Page URL After searching "<SEARCH_VALUE>"
    And Verifying the Search Page Title After searching "<SEARCH_VALUE>"
    And Take a screenshot
    Then Validate search results have less than 3 items

    Examples:
      | SEARCH_VALUE | DEVICE  |
      | Azure        | DESKTOP |
      | Azure        | MOBILE  |