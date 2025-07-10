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
@inventory
Feature: Product Page Functionality
  I want to use this template for my feature file

  @inventory
  Scenario: Successfully added product to cart
    Given I'am logged in to SauceDemo with enter "standard_user" and password "secret_sauce"
    When User adds to cart
    And User views product in cart
    Then User successfully added product from Products page