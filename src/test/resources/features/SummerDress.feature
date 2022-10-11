@test
Feature: Buying Summer Dress

  Background:
    Given the user navigates to main page

  Scenario Outline: Verify an item can be added to cart

    When the user hovers over DRESSES and clicks on SUMMER DRESSES
    And clicks on the image of the dress
    And selects "<quantity>", "<size>" and "<color>" of the dress
    And adds one of the SUMMER DRESSES to the cart
    Then  verify successfully added message appeared in the pop-up window
    When the user clicks on proceed to checkout button in the pop-up window
    Then verify that "SHOPPING-CART SUMMARY" is displayed
    When the user clicks on proceed to checkout button on shopping-cart summary
    Then verify that sign-in button is displayed

    Examples:

      | quantity | size | color  |
      | 1        | S    | Black  |
      | 2        | M    | Orange |


