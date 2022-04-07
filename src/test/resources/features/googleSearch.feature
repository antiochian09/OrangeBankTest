Feature: Search Orange Bank on Google

  @myTest
  Scenario: Search Orange Bank and verify number of results
    When User open the "https://www.google.es"
    And User type "Orange Bank" in the search box
    Then Verify number of results is more than 100000 and is not less than 10000
