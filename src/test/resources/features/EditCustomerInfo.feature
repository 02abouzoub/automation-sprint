Feature: Editable customer information

  Agile Story:
  US05 As a Sales Manager, I should be able to create a new customer from "Sales" module

  AC02:
  clicking any customer and then clicking the edit button, all the boxes entered information
  should be editable again.

  @edit
  Scenario:
    Given  user chooses a customer from customers page
    When user clicks the edit button
    Then user should be able to edit all customer information entered

