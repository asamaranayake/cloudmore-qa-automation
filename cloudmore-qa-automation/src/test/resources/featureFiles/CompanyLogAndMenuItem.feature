# Part B (UI test automation) : Question 1
# Verify company logo and menu items are displayed on next pages: Solutions, Integrations, Resources, Pricing, Company.

@ui @QuestionOne @assignment
Feature: Company logo and menu items are displayed on next pages: Solutions, Integrations, Resources, Pricing, Company.


  Scenario: Verify company logo and menu items are displayed on Home Page.
    Given User direct to the Home Page
    And User Accepts the Cookie Consent
    Then Verify the HomePage availability
    And Verifying the Company logo is visible from the Home page
    Then Verifying the "Solutions" Menu link is visible from the Home page
    And Verifying the "Company" Menu link is visible from the Home page
    And Verifying the "Integrations" Menu link is visible from the Home page
    And Verifying the "Resources" Menu link is visible from the Home page
    And Verifying the "Pricing" Menu link is visible from the Home page

  Scenario:Verify company logo and menu items are displayed on Solutions Page.
    Given User direct to the Home Page
    When Navigate to "Solutions" page from home Page
    Then Verify the Solutions Page availability
    And Verifying the Company logo is visible from the Solutions page
    Then Verifying the "Solutions" Menu link is visible from the Solutions page
    And Verifying the "Company" Menu link is visible from the Solutions page
    And Verifying the "Integrations" Menu link is visible from the Solutions page
    And Verifying the "Resources" Menu link is visible from the Solutions page
    And Verifying the "Pricing" Menu link is visible from the Solutions page

  Scenario:Verify company logo and menu items are displayed on Company Page.
    Given User direct to the Home Page
    When Navigate to "Company" page from home Page
    Then Verify the Company Page availability
    And Verifying the Company logo is visible from the Company page
    Then Verifying the "Solutions" Menu link is visible from the Company page
    And Verifying the "Company" Menu link is visible from the Company page
    And Verifying the "Integrations" Menu link is visible from the Company page
    And Verifying the "Resources" Menu link is visible from the Company page
    And Verifying the "Pricing" Menu link is visible from the Company page

  Scenario:Verify company logo and menu items are displayed on Integrations Page.
    Given User direct to the Home Page
    When Navigate to "Integrations" page from home Page
    Then Verify the Integrations Page availability
    And Verifying the Company logo is visible from the Integrations page
    Then Verifying the "Solutions" Menu link is visible from the Integrations page
    And Verifying the "Company" Menu link is visible from the Integrations page
    And Verifying the "Integrations" Menu link is visible from the Integrations page
    And Verifying the "Resources" Menu link is visible from the Integrations page
    And Verifying the "Pricing" Menu link is visible from the Integrations page

  Scenario:Verify company logo and menu items are displayed on Resources Page.
    Given User direct to the Home Page
    When Navigate to "Resources" page from home Page
    Then Verify the Resources Page availability
    And Verifying the Company logo is visible from the Resources page
    Then Verifying the "Solutions" Menu link is visible from the Resources page
    And Verifying the "Company" Menu link is visible from the Resources page
    And Verifying the "Integrations" Menu link is visible from the Resources page
    And Verifying the "Resources" Menu link is visible from the Resources page
    And Verifying the "Pricing" Menu link is visible from the Resources page

  Scenario:Verify company logo and menu items are displayed on Pricing Page.
    Given User direct to the Home Page
    When Navigate to "Pricing" page from home Page
    Then Verify the Pricing Page availability
    And Verifying the Company logo is visible from the Pricing page
    Then Verifying the "Solutions" Menu link is visible from the Pricing page
    And Verifying the "Company" Menu link is visible from the Pricing page
    And Verifying the "Integrations" Menu link is visible from the Pricing page
    And Verifying the "Resources" Menu link is visible from the Pricing page
    And Verifying the "Pricing" Menu link is visible from the Pricing page