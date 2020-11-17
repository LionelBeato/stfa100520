

Feature: When will the bird sing?
  Have a bird sing when it's morning

  Scenario: It is morning
    Given that it is <morning>
    When I listen for a bird
    Then I should hear "a beautiful song"

    morning
    -------
