@B29G17-236
Feature: As a POS & sales manager, I want to get repair order on the Repairs page.

  Background:
    Given user in the login page

  @B29G17-235
  Scenario Outline: users can select all the repair orders by clicking the top checkbox.

    When the user login with valid "<email>","<password>"
    And user clicks on the repair button in the dashboard
    And user click on the first checkbox
    Then user is able to select all repair orders
    @POS
    Examples:
      | email                  | password   |
      | posmanager5@info.com   | posmanager |
      | posmanager33@info.com  | posmanager |
      | posmanager87@info.com  | posmanager |
      | posmanager103@info.com | posmanager |
      | posmanager155@info.com | posmanager |

    @salesManager
    Examples:
      | email                    | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager44@info.com  | salesmanager |
      | salesmanager97@info.com  | salesmanager |
      | salesmanager101@info.com | salesmanager |
      | salesmanager105@info.com | salesmanager |

