Feature:Filter Functionality of RS company
  As a buyer I should be able to use different filter options
  in Search functionality

  Background:
    Given User is on homepage

  Scenario Outline: Searching products using Search Box and applying one filter
      When User types adhesives to search box
      Then User sees Adhesives under top matching categories
      And User clicks on Adhesives
      And User clicks on Brand
      And User clicks on Raytech
      And User clicks Apply Filters
      Then User sees "<Brand>"

      Examples: The Brand  used in the test are following
      |Brand   |
      |Raytech |


    Scenario: Searching products using MPN and applying filters
      When User toggles  MPN
      And User types 702060 in search box
      And User clicks on Temperature Controllers box
      And User clicks on  Size
      And User clicks on "109 x 22.5mm"
      And User clicks on Apply Filters
      Then User locates "Jumo iTRON PID Temperature Controller, 109 x 22.5mm, 2 Output Relay, 20 → 53 V ac/dc Supply Voltage" product on the page


    @wip
    Scenario Outline: Searching products using Browse option and applying three filters

      When User clicks on Browse option
      And User clicks on Electrical,Automation&Cables
      And User clicks on Automation&Control Gear
      And User clicks on Contactors&Auxiliary Contactors
      And User clicks on Contactors
      And User clicks on Brand
      And User clicks on "<Brand>" and "<Number of poles>" and "<Contact Current Rating>"
      And User clicks Apply Filters
      Then User sees "<Brand>" and "<Number of poles>" and "<Contact Current Rating>"

      Examples:
        | Brand | Number of poles | Contact Current Rating |
        |  ABB  |      1                |   35 A           |



