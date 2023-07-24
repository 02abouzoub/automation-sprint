@B29G17-223
Feature: As sales and expense manager, I want to Login with valid credentials and get my account
  name.

  Background:
    Given User is on the login page

  @B29G17-219
  Scenario Outline: user can log in with valid credentials and click login
    When the user login with "<email>","<password>"
    Then user sees account holder name is "<name>"
    @expenseManager
    Examples:
      | email                       | password        | name               |
      | expensesmanager10@info.com  | expensesmanager | ExpensesManager10  |
      | expensesmanager22@info.com  | expensesmanager | ExpensesManager22  |
      | expensesmanager52@info.com  | expensesmanager | ExpensesManager52  |
      | expensesmanager99@info.com  | expensesmanager | ExpensesManager99  |
      | expensesmanager100@info.com | expensesmanager | ExpensesManager100 |

    @salesManager
    Examples:
      | email                    | password     | name            |
      | salesmanager6@info.com   | salesmanager | SalesManager6   |
      | salesmanager44@info.com  | salesmanager | SalesManager44  |
      | salesmanager105@info.com | salesmanager | SalesManager105 |

  @B29G17-220
  Scenario Outline: user can log in with valid credentials plus EnterKey
    When the user login with "<email>","<password>" and hit the Enter key
    Then user sees account holder name is "<name>"
    @expenseManager
    Examples:
      | email                      | password        | name              |
      | expensesmanager15@info.com | expensesmanager | ExpensesManager15 |
      | expensesmanager36@info.com | expensesmanager | ExpensesManager36 |
      | expensesmanager90@info.com | expensesmanager | ExpensesManager90 |
      | expensesmanager99@info.com | expensesmanager | ExpensesManager99 |
      | expensesmanager74@info.com | expensesmanager | ExpensesManager74 |
    @salesManager
    Examples:
      | email                    | password     | name            |
      | salesmanager8@info.com   | salesmanager | SalesManager8   |
      | salesmanager102@info.com | salesmanager | SalesManager102 |
      | salesmanager77@info.com  | salesmanager | SalesManager77  |


  @B29G17-221
  Scenario Outline: User use invalid login credentials
    When the user login with the "<Invalid email>","<Invalid password>"
    Then "Wrong login/password" error message

    Examples:
      | Invalid email       | Invalid password |
      | salesman@info.com   | salesmanager     |
      | sales@info.com      | Abc              |
      | s.manager@@info.com | Abc123           |
      | s.manager nfo.com   | Abc123           |
      | s.*&@info.com       | Abc123           |
      | @info.com           | Ab67             |

  @B29G17-222
  Scenario Outline: User gets the "Please fill out this field." message password field.
    When user login with "<email>" and leaves password field blank
    Then user sees "Please fill in this field." message from password field
    Examples:
      | email                       |
      | expensemanager@info.com     |
      | salesmanager37@info.com     |
      | inventorymanager37@info.com |
      | posmanager37@info.com       |


  @B29G17-277
  Scenario Outline: User gets the "Please fill out this field." message email field.
    When user login with "<password>" and leave email field blank
    Then user sees "Please fill in this field." message from email field
    Examples:
      | password         |
      | salesmanager     |
      | expensemanager   |
      | expensemanager   |
      | inventorymanager |