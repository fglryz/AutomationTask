
  Feature:Buying items
   Background:
    Given the user navigates to main page
@wip
  Scenario: User should be able to start shopping process from home page to checkout
    When User clicks "T-SHIRTS" tab
    And User hovers over Faded Short Sleeve T Shirt
    When User adds MORE button
    And selects one, M and Blue of the T-Shirt
    When User clicks the add to cart button
    And User clicks continue shopping button
    When User clicks Dress button
    When User clicks Evening Dress
    When User clicks the S size
    When User clicks the Beige colour
    And User clicks the add to cart button
    And User clicks continue shopping button
    When User clicks Dress button
    When User clicks Summer Dress
    When User hovers Printed Summer Dress
    When User clicks the "M" size
    When User clicks the orange colour
    When User clicks the add to chart button
    When User clicks proceed to checkout button

    When User removes Printed Dress
    When User add the a Faded Short Sleeve T-Shirts
    Then User sees the total price  of Printed Dress
    Then User sees the total price  of Fladed Short Sleeves TShirt
  Then User sees the card total is "$65.53"






