@scenario
Feature: Product Creation as POS manager

  Agile Story:

  US06:
  As a PosManager, I should be able to add new products to inventory.

  AC01:
  The user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.


  Background:
    Given user is on the login page
    When user enters valid "email"
    And user enters a valid "passWord"
    And user clicks log in button
    And user clicks point of sale
    And user clicks product
    Then user is on products page

  Scenario Outline:
    When user clicks create button
    And user enters a "<productName>"
    And user clicks the save button
    Then user can see new product displayed

    Examples:
      | productName      |
      | Bug Spray        |
      | Mushroom         |
      | Beer             |
      | Wine             |
      | Lobster Bisque   |
      | 13Green          |
      | $ugarBrand.co... |
