# This file describes your test scenarios per feature
# It uses Gherkin for its writing standard

Feature: They love me.
  See if love is returned

  Scenario: They love me
    Given petal is odd
    When I pluck the petal
    Then I should say "they love me"

  Scenario: They love me not
    Given petal is even
    When I pluck the petal
    Then I should say "they love me not"




#  Scenario: Friday is Friday
#    Given today is Friday
#    When I ask whether it's Friday yet
#    Then I should be told "TGIF"