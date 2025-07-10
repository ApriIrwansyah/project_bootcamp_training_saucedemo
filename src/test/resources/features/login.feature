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
@login
Feature: SauceDemo Login Feature
  I want to use website dummy for my feature file
  
  Background:
    Given User is on SauceDemo login page
  	
  @loginSuccess @smoke @positive
  Scenario: Successful login with valid credentials
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to homepage

  @loginFailed @negative
  Scenario: Unsuccessful login with invalid credentials
    When User enters username "invalid_user" and password "wrong_password"
    And User clicks on login button
    Then User should see an error message
   
  @loginSuccessOutline
	Scenario Outline: Login with multiple credentials
    When User enters username "<username_outline>"  and password "<password_outline>" outline
    And User clicks on login button
    # Then User should be redirected to homepage
    Then I should be logged in successfully

    Examples:
      | username_outline | password_outline     |
      | standard_user    | secret_sauce  				|
      | locked_out_user  | secret_sauce  				|
