
@tag
Feature: Title of your feature
	I want to use this template for my feature file

@tag131 @commontag13
Scenario: Title of your scenario
Given I want to write a step
Given I want to write a tag131 step

@tag132 @commontag13
Scenario: Title of your scenario
Given I want to write a step
Given I want to write a tag132 step

@tag133 @commontag13
Scenario Outline: Simple Test Case
Given I open browser
Given I hit the tricentis application URL
Given I am on WebShopHomePage Screen
Given I click on siteMap linklink
Given I click on shippingAndReturns link
Given I click on search link
Given I click on conditionsOfUse linklink
Given I click on privacyNotice link
Given I click on aboutUs linklink
Given I click on news linklink
Given I click on contactUs linklink
Given I wait for 3 seconds
Given I close browser

Examples: 
 | partiallinktext |#second|
 | OfUse |#3|
 
@tag134 @commontag13
Scenario: Simple Test Case
Given I open browser
Given I hit the tutorialhtml application URL
Given I wait for 3 seconds
Given I close browser

@tag134_duplicate @commontag13
Scenario: Simple Test Case
Given I open browser
Given I hit the tutorialhtml application URL
Given I wait for 10 seconds
Given I close browser

@tag135 @commontag13
Scenario Outline: Simple Test Case
Given I open browser
Given I hit the tricentis application URL
Given I am on WebShopHomePage Screen
Given I select Poor option and click on Vote button
Given I verify the confirmation message <vote_confirmation_message> is displayed
Given I wait for 3 seconds
Given I close browser

Examples: 
 | vote_confirmation_message |
 |Only registered users can vote.|
 
@tag136 @commontag13
Scenario Outline: Simple Test Case
Given I open browser
Given I hit the tricentis application URL
Given I am on WebShopHomePage Screen
Given I click on all the footer links
Given I wait for 3 seconds
Given I close browser

Examples: 
 | partiallinktext |#second|
 | OfUse |#3|
 
@tag137 @commontag13
Scenario Outline: Simple Test Case
Given I open browser
Given I hit the tricentis application URL
Given I am on WebShopHomePage Screen
Given I click on all the footer links with common method
Given I wait for 3 seconds
Given I close browser

Examples: 
 | partiallinktext |#second|
 | OfUse |#3|
 
 @tag138 @commontag13
Scenario Outline: Simple Test Case
Given I open browser
Given I hit the tricentis application URL
Given I am on WebShopHomePage Screen
Given I click on all the footer links with common method
Given I click on BOOKS linklink
Given I am on WebShopBooksPage Screen
Given I click on under25 linklink
Given I wait for 3 seconds
Given I close browser

Examples: 
 | partiallinktext |#second|
 | OfUse |#3|
