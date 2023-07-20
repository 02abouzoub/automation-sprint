@B29G17-273-smoke
Feature: Default


	#{color:#de350b}_*US06:*_{color}
	#As a PosManager, I should be able to add new products to inventory.
	#
	#{color:#de350b}_*AC01:*_{color}
	#The user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.
	@B29G17-268
	Scenario Outline: US06AC01TC01-As a user, I should be able to create new products with name only
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

	#{color:#de350b}_*US06:*_{color}
	#As a PosManager, I should be able to add new products to inventory.
	#
	#{color:#de350b}_*AC02:*_{color}
	#clicking any product and then clicking the edit button all
	#the boxes entered information can be editable again.
	@B29G17-272
	Scenario Outline: US06AC02TC01-As a user I should be able to edit products info entered
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