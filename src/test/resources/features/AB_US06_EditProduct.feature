@edit
Feature: Edit Product Information in POS

  Agile Story:

  US06:
  As a PosManager, I should be able to add new products to inventory.

  AC02:
  clicking any product and then clicking the edit button all
  the boxes entered information can be editable again.

  Scenario Outline:
    Given user is on the login page
    When user enters valid "<userName>"
    And user enters a valid "<passWord>"
    And user clicks log in button
    And user clicks point of sale
    And user clicks product
    Then user chooses a product
    Then user clicks edit button
    And user edits product information
    Then user clicks save button



    Examples:
      | userName               | passWord   |
      | posmanager9@info.com   | posmanager |
      | posmanager25@info.com  | posmanager |
      | posmanager46@info.com  | posmanager |
      | posmanager67@info.com  | posmanager |
      | posmanager88@info.com  | posmanager |
      | posmanager99@info.com  | posmanager |
      | posmanager103@info.com | posmanager |


