@B29G17-265
Feature: The Repairs page information
  As a POS & sales manager
  I want to access the Repairs page.

  @B29G17-262
  Scenario Outline: Verify columns on the Repairs page
    Given user is on the login page
    When user enters "<email>" and "<passwords>" click on the user button
    And user click on the Repairs page
    Then system displays columns to view the the repair orders on the Repairs page
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |

    Examples:
      | email                   | passwords    |
      | posmanager25@info.com   | posmanager   |
      | posmanager35@info.com   | posmanager   |
      | posmanager85@info.com   | posmanager   |
      | salesmanager15@info.com | salesmanager |
      | salesmanager55@info.com | salesmanager |
      | salesmanager85@info.com | salesmanager |

@B29G17-264
  Scenario Outline: Verify search functionality with Repair Reference data
    When user login with valid credentials "<email>" and "<password>"
    And user clicks on Repairs link and land on Repair Orders page
    And user type a "RMA/00246" in the search box and click
    Then user should see "RMA/00246" on the list

    Examples:
      | email                   | password     |
      | posmanager25@info.com   | posmanager   |
      | salesmanager15@info.com | salesmanager |