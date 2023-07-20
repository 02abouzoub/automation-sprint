@B29G17-223
Feature: As sales and expense manager, I want to Login with valid credentials and get my account
  name.

  Background:
    Given User is on the login page

  @B29G17-219
  Scenario Outline: user can log in with valid credentials and click login
    When the user login with "<email>","<password>"
    Then user sees account holder name is "<email>"
    @expenseManager
    Examples:
      | email                       | password        |
      | expensesmanager10@info.com  | expensesmanager |
      | expensesmanager22@info.com  | expensesmanager |
      | expensesmanager52@info.com  | expensesmanager |
      | expensesmanager99@info.com  | expensesmanager |
      | expensesmanager100@info.com | expensesmanager |



    @salesManager
    Examples:
      | email                    | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager44@info.com  | salesmanager |
      | salesmanager105@info.com | salesmanager |

  @B29G17-220
  Scenario Outline: user can log in with valid credentials plus EnterKey
    When the user login with "<email>","<password>" and hit the Enter key
    Then user sees account holder name is "<email>"
    @expenseManager
    Examples:
      | email                  | password        |
      | expensesmanager15@info.com | expensesmanager |
      | expensesmanager36@info.com | expensesmanager |
      | expensesmanager90@info.com | expensesmanager |
      | expensesmanager99@info.com | expensesmanager |
      | expensesmanager74@info.com | expensesmanager |
    @salesManager
    Examples:
      | email                | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager102@info.com | salesmanager |
      | salesmanager77@info.com  | salesmanager |


  @B29G17-221
  Scenario Outline: User use invalid login credentials
    When the user login with the "<Invalid username>","<Invalid password>"
    Then "Wrong login/password" error message

    Examples:
      | Invalid username    | Invalid password |
      | salesman@info.com   | salesmanager     |
      | sales@info.com      | Abc              |
      | s.manager@@info.com | Abc123           |
      | s.manager nfo.com   | Abc123           |
      | s.*&@info.com       | Abc123           |
      | @info.com           | Ab67             |

  @B29G17-222
  Scenario Outline: User gets the "Please fill out this field." message for at least one blank field.
    When the user login with either "<Blank username>" or "<Blank password>"
    Then user sees "Please fill out this field." message
    Examples:
      | Blank username          | Blank password |
      |                         | salesmanager   |
      |                         | manager        |
      | s.manager@info.com      |                |
      | salesmanager37@info.com |                |
      |                         |                |
      |                         |                |

