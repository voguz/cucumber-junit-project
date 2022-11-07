Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  @webtableAppOrder
  Scenario Template:

    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table



    @femaleScientist
    Examples: Famous female scientist
      | productType | quantity | customerName      | street              | city   | state   | zipCode | cardType | cardNumber       | expiryDate | expectedName      |
      | Familybea   | 2        | Rosalind Franklin | 221B Baker Street   | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Rosalind Franklin |
      | MoneyCog    | 3        | Olesya  Oguz      | 222 Broadway Street | London | England | 50505   | visa     | 1111333344442222 | 12/23      | Olesya Oguz       |
      | Screenable  | 1        | Burak Oguz        | 1111 Bebek street   | London | England | 50505   | visa     | 1111333322224444 | 12/23      | Burak Oguz        |
      | Familybea   | 4        | Lionel Messi      | 1525 Village town   | London | England | 50505   | visa     | 1111222244443333 | 12/23      | Lionel Messi      |


    @maleScientist
    Examples: Famous male scientist
      | productType | quantity | customerName  | street              | city     | state   | zipCode | cardType | cardNumber       | expiryDate | expectedName  |
      | Familybea   | 2        | Nihat Oguz    | 221B Baker Street   | London   | England | 50505   | visa     | 1111222233334444 | 12/23      | Nihat Oguz    |
      | MoneyCog    | 3        | Pablo Escobar | 222 Broadway Street | London   | England | 50505   | visa     | 1111333344442222 | 12/23      | Pablo Escobar |
      | Screenable  | 1        | Tony Montana  | 1111 Bebek street   | Istanbul | Turkey  | 50505   | visa     | 1111333322224444 | 12/23      | Tony Montana  |
      | Familybea   | 4        | Jon Snow      | 1525 Village town   | Paris    | France  | 50505   | visa     | 1111222244443333 | 12/23      | Jon Snow      |

