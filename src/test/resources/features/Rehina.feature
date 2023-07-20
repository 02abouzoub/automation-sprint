@B29G17-234
Feature: Default

	# *User Story :*
	#As POS & Sales manager, I want to manage quotations on the Sales page.
	#
	#
	#*Acceptance Criteria:*
	#1. Verify users can select all the quotations by clicking the top checkbox.
	@B29G17-232
	Scenario: B29G17-208 Verifying users can select all the quotations
		Given Users on the sales page
		When Users click the checkbox on the top
		Then All the quotation should be selected