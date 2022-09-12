Feature: Search functionality with different filter options

  Background:
    Given User is on homepage

  Scenario Outline: Searching products using Search Box
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

  @wip
    Scenario: Searching products using MPN
      When User toggles  MPN
      And User types 702060 in search box
      And User clicks on Temperature Controllers box
      And User clicks on  Size
      And User clicks on "109 x 22.5mm"
      And User clicks on Apply Filters
      Then User locates "Jumo iTRON PID Temperature Controller, 109 x 22.5mm, 2 Output Relay, 20 → 53 V ac/dc Supply Voltage" product on the page



