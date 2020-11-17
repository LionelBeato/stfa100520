Feature: Searching on Google

  Scenario: Searching for Paul Hollywood
    Given "Paul Hollywood" is in the searchbox
    When I press the search button
    Then send me to the the search results page