@B29G17-266-Regression
Feature: Default

	#{color:#de350b}*_US05:_*{color}
	#
	#As a Sales Manager, I should be able to create a new customer from "Sales" module
	#
	# 
	#
	#_*{color:#de350b}AC01:{color}*_
	#The user can create a new customer by filling only the Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.
  @B29G17-217
  Scenario Outline: US05AC01TC01- As a user, i should be able to create a customer with only filling out their name and hitting save button
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

	#{color:#de350b}*_US05:_*{color}
	#
	#As a Sales Manager, I should be able to create a new customer from "Sales" module
	#
	# 
	#
	#_{color:#de350b}*AC02:*{color}_
	#
	#When clicking any customer and then clicking the edit button all the boxes entered information can be editable again.
  @B29G17-263
  Scenario Outline: US05AC02TC01-As a user, I should be able to edit customer information entered
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