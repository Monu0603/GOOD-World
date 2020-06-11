Feature: To validate the login functionality of Addactin app

  Scenario: TO varify login with valid username and password
    Given user has to be there in login page
    When user should enter username and password
    And user has to click on login page

  Scenario: To validate the search Functionlity with valid data
    Given User has to be there at login page
    When user has to enter valid username and password and click on login
    And user has to select Location
    And user has to select	Hotels
    And user has to selectno of Rooms
    And user has to select Adult as per Room
    And user has to select children per Room
    Then User has to click on search button
