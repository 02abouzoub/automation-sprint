@scenarioOutline
Feature: Product Creation as POS manager

  Agile Story:

  US06:
  As a PosManager, I should be able to add new products to inventory.

  AC01:
  The user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.


  Scenario Outline:
    Given user is on the login page
    When user enters valid "<userName>"
    And user enters a valid "<passWord>"
    And user clicks log in button
    And user clicks point of sale
    And user clicks product
    Then user is on products page
    When user clicks create button
    And user enters a "<productName>"
    And user clicks the save button
    Then user can see new product displayed

    Examples:
      | userName               | passWord   | productName      |
      | posmanager5@info.com   | posmanager | Bug Spray        |
      | posmanager17@info.com  | posmanager | Mushroom         |
      | posmanager38@info.com  | posmanager | Beer             |
      | posmanager51@info.com  | posmanager | Wine             |
      | posmanager76@info.com  | posmanager | Lobster Bisque   |
      | posmanager101@info.com | posmanager | 13Green          |
      | posmanager105@info.com | posmanager | $ugarBrand.co... |
