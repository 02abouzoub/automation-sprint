@B29G17-246
Feature: Accessing different modules
  US:As an Event manager, I should be able to access the main modules


@B29G17-245
  Scenario Outline: Login as event manager
    Given user is on the login page
    When user enters "<email>","<password>"
    And user clicks on the login button
    Then user should see all  modules
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | CRM         |
      | Sales       |
      | Website     |
      | Inventory   |
      | Repairs     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Maintenance |
      | Dashboards  |
    Examples:
      | email                        | password         |
      | eventscrmmanager10@info.com  | eventscrmmanager |
      | eventscrmmanager31@info.com  | eventscrmmanager |
      | eventscrmmanager61@info.com  | eventscrmmanager |
      | eventscrmmanager81@info.com  | eventscrmmanager |
      | eventscrmmanager101@info.com | eventscrmmanager |
      | eventscrmmanager110@info.com | eventscrmmanager |
