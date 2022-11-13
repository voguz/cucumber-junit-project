Feature: ETSY search product

  @etsy
  Scenario: ETSY search something
    Given user should be on the main page ETSY
    When user clicks to search button
    And user search the "Kitchen stuff"
    Then user sees the products