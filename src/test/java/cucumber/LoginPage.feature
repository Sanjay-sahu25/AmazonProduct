Feature: Purchase the order from Ecommerce website
  I want to use this template for my feature file

  Background:
    Given I landed on Ecommerce Page
  @Regression
  Scenario Outline: Positive Test of Login the page
    Given Logged in with username <name> and password <password>
    When search the <item> and with <price> and add to cart
    Then Sign out of the page
    Examples:
      |name                       |password       |item        | price|
      |sanjaybattipally@gmail.com |Janaki@1970*   |samsung s23 |37899


