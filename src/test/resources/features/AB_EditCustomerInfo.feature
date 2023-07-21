Feature: Editable customer information

  Agile Story:
  US05 As Sales Manager, I should be able to create a new customer from "Sales" module

  AC02:
  clicking any customer and then clicking the edit button, all the boxes entered information
  should be editable again.

  @edit
  Scenario Outline:
    Given user is on login page
    When user enter valid "<userName>"
    And user enter a valid "<passWord>"
    And user click log in button
    Then user click sales
    When user is on sales module page
    And user click on customers tab
    Given user is on customer page
    When user chooses a customer from customers page
    And user clicks the edit button
    Then user should be able to edit all customer information entered

    Examples:
      | userName                 | passWord     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager18@info.com  | salesmanager |
      | salesmanager57@info.com  | salesmanager |
      | salesmanager74@info.com  | salesmanager |

