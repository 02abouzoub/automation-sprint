@B29G17-271
Feature: Accessing modules
    User Story:
    As a POS manager, I should be able to access the main modules.
  @B29G17-270
  Scenario Outline: Checking the number of modules
    Given User is on the login page
    Given User logs in with "<email>", "<password>"
    When User is on the base page
    Then User should see 22 modules

    Examples: Credentials we are going to use
      | email                  | password   |
      | posmanager13@info.com  | posmanager |
      | posmanager38@info.com  | posmanager |
      | posmanager66@info.com  | posmanager |
      | posmanager99@info.com  | posmanager |
      | posmanager112@info.com | posmanager |
      | posmanager143@info.com | posmanager |
