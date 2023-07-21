@customerCreation
Feature: Customer Creation from Sales module

  Agile Story:
  US05- As Sales Manager, I should be able to create a new customer from "Sales" module

  AC01:
  The user can create a new customer by filling only the Name input box and after clicking
  the save button, the information of the customer which the user entered should be displayed.

  @scenarioOutline
  Scenario Outline: Login with multiple users and creating customers with multiple users
    Given user is on the login page
    When user enters valid "<userName>"
    And user enters a valid "<passWord>"
    And user clicks log in button
    Then user should land on inbox page
    Then user click on sales
    When user is on Sales module page
    And user clicks on customers tab
    And user clicks on create
    And user fills out "<customerName>"
    And user clicks save
    Then user sees customer information displayed

    Examples: These are the users we are going to login with
    #Comman+option+L
      | userName                 | passWord     | customerName    |
      | salesmanager6@info.com   | salesmanager | john douey      |
      | salesmanager18@info.com  | salesmanager | hamid eistein   |
      | salesmanager39@info.com  | salesmanager | caleb linkhorn  |
      | salesmanager57@info.com  | salesmanager | slim shady      |
      | salesmanager74@info.com  | salesmanager | brad pitt       |
      | salesmanager92@info.com  | salesmanager | warren buffeett |
      | salesmanager105@info.com | salesmanager | patel saravisan |
      | salesmanager106@info.com | salesmanager | ming wu         |




