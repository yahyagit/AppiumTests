Feature: Your appium training

  Scenario: User should able to login to app
    Given When I am on login page
    When User enters email "abc@gmail.com" and password as "asdasd"
    Then It takes to home screen


  Scenario: Happy path Go ride booking
    Given User is logged in
    And User taps on Go-Ride
    When User selects Source location as "Indomaret"
    And User selects Destination location as "Monumen Nasional"
    Then User sees payment option
    And User selects Payment Method as "cash" and books a Ride
    Then User sees finding driver page
