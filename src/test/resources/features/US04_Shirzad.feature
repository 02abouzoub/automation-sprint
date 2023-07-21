@B29G17-261
@Calendar
Feature: Creating events on the calendar as a Posmanager
  User Story:
  As a Posmanager, I should be able to create events on my calendar from "Calendar" module.


  Background:
    Given User is on the login page

  @B29G17-258
  Scenario Outline: Creating an event
    Given User logs in with "<email>", "<password>"
    And User goes to  the calendar page
    When User clicks on time box
    Then User should create an event

    Examples: Credentials we are going to use
      | email                  | password   |
      | posmanager10@info.com  | posmanager |
      | posmanager35@info.com  | posmanager |
      | posmanager60@info.com  | posmanager |
      | posmanager90@info.com  | posmanager |
      | posmanager122@info.com | posmanager |
      | posmanager144@info.com | posmanager |

  @B29G17-259
  Scenario Outline: Viewing event details
    Given User logs in with "<email>", "<password>"
    And User goes to  the calendar page
    When User creates the event at "<time>" on the calendar
    And User clicks the event
    Then User should see event details
    Examples: Credentials we are going to use
      | email                  | password   | time |
      | posmanager15@info.com  | posmanager | 3    |
      | posmanager45@info.com  | posmanager | 5    |
      | posmanager70@info.com  | posmanager | 8    |
      | posmanager92@info.com  | posmanager | 11   |
      | posmanager112@info.com | posmanager | 14   |
      | posmanager134@info.com | posmanager | 17   |

