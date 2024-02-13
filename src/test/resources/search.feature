Feature: Product Search
  As a user
  I want to search for products on the website

  Scenario: Search for a product
    Given I am logged in
    When I search for "book"
    Then I should see relevant search results
