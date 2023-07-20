@B29G17-260
Feature: Documentation Page
  As a user
  I want to access the documentation page
  So that I can learn about the product's features and functionality

  @B29G17-257
  Scenario Outline: Accessing the documentation page
    Given user logged in with "<username>" and "<password>"
    When user accesses the documentation page
    Then user should see the "Odoo Documentation" message in the new window
    Then user should see four main topics
      | User Docs            |
      | Install and Maintain |
      | Developer            |
      | Contribute           |

    Examples:
      | username               | password   |
      | posmanager7@info.com   | posmanager |
      | posmanager16@info.com  | posmanager |
      | posmanager35@info.com  | posmanager |
      | posmanager67@info.com  | posmanager |
      | posmanager99@info.com  | posmanager |
      | posmanager112@info.com | posmanager |
      | posmanager150@info.com | posmanager |