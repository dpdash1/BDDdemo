#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @appium @apptc001
  Scenario: run first cucumber based appium test
    Given I open ApiDemos app on android device
    And I click on Preference link
    And I click on Preference dependencies link
    And I verify that WiFi settings link is disabled
    And I select Wifi checkbox
    And I verify that WiFi settings link is enabled
    And I click on WiFi settings link
    And I enter "new connection" text in WiFi settings textfield
    And I click on OK button
    


