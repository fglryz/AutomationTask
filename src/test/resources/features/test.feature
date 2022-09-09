Feature: Purchase Functionality of RS Application
  As a buyer, I should be able navigate through products
  so that I can purchase from application online

  Background:
  Given User is on homepage

  Scenario: Adding product to cart by choosing Browse the shop option

    When User clicks Contactors
    And User clicks to Add button under the first product
    And User clicks to Cart button
    Then User sees  chosen product in the cart


  Scenario: Adding product to cart by Browse option under the RS logo

    When User clicks on Browse option
    And User clicks on Electrical,Automation&Cables
    And User clicks on Automation&Control Gear
    And User clicks on Contactors&Auxiliary Contactors
    And User clicks on Contactors
    And User clicks to Add button under the first product
    And User clicks to Cart button
    Then User sees chosen product in the cart

    @wip
    Scenario Outline: Searching products using Search Box and Filtering Functionality

   When User types adhesives to search box
   Then User sees Adhesives under top matching categories
   And User clicks on Adhesives
   And User clicks on Brand
   And User clicks on GORILLA GLUE EUROPE LTD (3)
   And User clicks Apply Filters
   Then User sees "<Brand>" and "<Adhesive Type>"

      Examples: The Brand and Adhesive Type used in the test are following
        |Brand                   | Adhesive Type   |
        |GORILLA GLUE EUROPE LTD | Contact Adhesive|










