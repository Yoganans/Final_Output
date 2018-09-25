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
@tc
Feature: To Order a TShirt and to update persoanl information
  

  @newtc1
  Scenario: To order a T-shirt in the given application
    Given User opens the application in "chrome" browser
    When User opens the application with valid "someone@example.com" and "Password123"
    And orders the Tshirt
    Then validate the ordered item in order history
    
  @newtc2
  Scenario Outline: To update Personal information
    Given User opens the application in "chrome" browser
    When User opens the application with valid "<UserName>" and "<Password>"
    And updates the First Name "<FirstName>" with "<Password>" current password
    Then new new values should get updated
    
    Examples:
    |browser |UserName						|Password		 |FirstName			| 
    |chrome  |someone@example.com           |Password123	 |Yogan				|

    
