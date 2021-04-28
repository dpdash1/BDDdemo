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
@tag
Feature: Web Service Test
  I want to test the web services in my framework

  @tagws1 @tagws
  Scenario Outline: Formula One Web Service Test - Verify the number of circuits for given season as per data
    Given I verify the number of circuits in <season> season is <numberofcircuits>
    
Examples: 
 | season |numberofcircuits|
 | 2017 |20|
 | 2016 |21|
 | 2015 |19|
 | 2014 |19|
 
   @tagws2 @tagws
  Scenario Outline: Formula One Web Service Test - Error when compared with incorrect data set
    Given I verify the number of circuits in <season> season is <numberofcircuits>
    
Examples: 
 | season |numberofcircuits|
 | 2017 |20|
 | 2016 |20|
 | 2015 |11|
 | 2014 |12|

   @tagws3 @tagws
  Scenario Outline: Formula One Web Service Test - Extract first circuit name for a given season
    Given I extract the first circuit name for <season> season
    
Examples: 
 | season |
 | 2017 |
 | 2016 |
 | 2015 |
 | 2014 |
 
 
    @tagws4 @tagws
  Scenario Outline: Formula One Web Service Test - Extract Nth circuit name for a given season
    Given I extract the <circuitnumber> circuit name for <season> season
    
Examples: 
 |circuitnumber| season |
 |1| 2017 |
 |5| 2016 |
 |10| 2015 |
 |15| 2014 |
 
    @tagws5 @tagws
  Scenario Outline: Formula One Web Service Test - Extract number of circuits and all circuit names for a given season
    Given I extract the total number of circuits for <season> season
    
Examples: 
 | season |
 | 2017 |
 | 2016 |
 | 2015 |
 | 2014 |
 
     @tagws6 @tagws
  Scenario Outline: Formula One Web Service Test - extract the total number of key value pairs
    Given I extract all values for <key> key from <api> api
 
 Examples: 
 |key| api |
 |userId| https://jsonplaceholder.typicode.com/todos |
 |username| https://jsonplaceholder.typicode.com/users |
 
 
 
