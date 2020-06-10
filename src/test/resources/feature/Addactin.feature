Feature: To validate the login functionality of Addactin app
Scenario Outline: TO varify login with valid username and password
   Given user has to be there in login page
    When user should enter "<username>" and "<password>"
    And user has to click on login page
    Then login should be successfull and it should navigate to next page

    Examples: 
      | username    | password     |
      | singh123456 | singh@123456 |

 Feature: To validate the Search functionality fo Addactin
  Scenario Outline: To validate the search Functionlity with valid data
  Given user has to enter valid "<username>" and "<password>"
    When user has to select Location
    And user has to select	Hotels
    And user has to selectno of Rooms
    And user has to select Adult as per Room
    And user has to select children per Room
    Then User has to click on search button
    Examples:
    |username|password|
    | singh123456 | singh@123456 |	