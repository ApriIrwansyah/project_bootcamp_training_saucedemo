#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
    
@checkout
Feature: Checkout Process
  I want to use this template for my feature file
  
	@checkoutSuccess
  Scenario: Successful checkout
    Given I am logged in to SauceDemo with enter "standard_user" and password "secret_sauce"
    When I add a product to cart and proceed to checkout
    And I enter checkout details "John" "Doe" "12345"
    Then I should complete the purchase successfully

	@checkoutSuccessOutline
  Scenario Outline: Successful checkout outline
    Given I am logged in to SauceDemo with enter "standard_user" and password "secret_sauce"
    When I add a product to cart and proceed to checkout
    And I enter checkout details "<firstName>" "<lastName>" "<postalCode>"
    Then I should complete the purchase successfully and displays a message

    Examples:
      | firstName | lastName | postalCode |
      | John      | Doe      | 12345      |
      | Alice     | Smith    | 54321      |
      | Bob       | Brown    | 67890      |
      
      

