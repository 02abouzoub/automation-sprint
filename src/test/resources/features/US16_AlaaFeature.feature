@B29G17-253
Feature: access functionality
  Agile User Story :
  As an Expenses manager, I should be able to access the different modules.

 @B29G17-252
  Scenario Outline: Login as an expenses manger
    Given user in on the login page
    When user enters "<email>","<password>"
    When user click in the login button
    Then user should see the modules bellow
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Lunch       |
      | Maintenance |
      | Dashboards  |

    Examples:
      | email                       | password        |
      | expensesmanager11@info.com  | expensesmanager |
      | expensesmanager21@info.com  | expensesmanager |
      | expensesmanager31@info.com  | expensesmanager |
      | expensesmanager41@info.com  | expensesmanager |
      | expensesmanager51@info.com  | expensesmanager |
      | expensesmanager61@info.com  | expensesmanager |
      | expensesmanager71@info.com  | expensesmanager |
      | expensesmanager81@info.com  | expensesmanager |
      | expensesmanager91@info.com  | expensesmanager |
      | expensesmanager101@info.com | expensesmanager |


