Feature: Purchase Functionality of RS Application
  As a buyer, I should be able navigate through products
  so that I can purchase from application online

  Background:
  Given User is on homepage

  Scenario: Adding first product to cart by choosing product categories on the Homepage

    When User clicks Contactors
    And User clicks to Add button under the first product
    And User clicks to Cart button
    Then User sees  chosen product in the cart


  Scenario: Adding second product to cart by Browse dropdown under the RS logo

    When User clicks on Browse option
    And User clicks on Electrical,Automation&Cables
    And User clicks on Automation&Control Gear
    And User clicks on Contactors&Auxiliary Contactors
    And User clicks on Contactors
    And User clicks to Add button under the first product
    And User clicks to Cart button
    Then User sees chosen product in the cart











