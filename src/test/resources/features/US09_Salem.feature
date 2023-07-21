@B29G17-239
Feature: As a Point of Sale manager (POS), I should be able to view product orders.

	#@B29G17-240
	Background: User is in the log in page
		When use enter "username" and "password"

@B29G17-237
	Scenario: 1. Verify the POS managers can view the order list on the Point of Sale page, after checking the Order
	Reference, all the orders should be checked.

		And user click the point of sale
		And user click the order from dashboard
		And user click the order Ref box
		Then verify all "boxes" are checked

@B29G17-238
	Scenario: verify the action drop down has 3 options
		And user click the point of sale
		And user click the order from dashboard
		And user click the order Ref box
		Then verify all "boxes" are checked
		Given the user is able to click the action button
		Then  user is able to see below options
			| Import |
			| Export |
			| Delete |