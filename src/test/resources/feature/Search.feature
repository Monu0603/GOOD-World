  Feature:To validate the Search functionality fo Addactin
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

