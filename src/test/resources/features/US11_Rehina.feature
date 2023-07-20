
 @B29G17-234
Feature: As POS and sales manager, I want to manage quotations on the sales page.

  Background:
    Given user is on the login page

  @B29G17-232
  Scenario: Verifying users can select all the quotations
    Given Users on the sales page
    When Users click the checkbox on the top
    Then All the quotation should be selected


