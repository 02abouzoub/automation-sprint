@B29G17-231
Feature: User Login
  User Story:
  As a POS and eventCRM manager, I want to be able to login with valid credentials
  So that I can access the system

  Background:
    Given user is on the login page

  @B29G17-224
  Scenario Outline: Positive login scenario
    When User enters correct "<email>" and "<password>"
    And  User click to the login button
    Then account holder name should be "<name>"

    @POSmanager
    Examples:

      |          email          |   password    |     name      |
      | posmanager6@info.com    |  posmanager   | POSManager6   |
      | posmanager15@info.com   |  posmanager   | POSManager15  |
      | posmanager25@info.com   |  posmanager   | POSManager25  |
      | posmanager34@info.com   |  posmanager   | POSManager34  |
      | posmanager42@info.com   |  posmanager   | POSManager42  |
      | posmanager56@info.com   |  posmanager   | POSManager56  |
      | posmanager68@info.com   |  posmanager   | POSManager68  |
      | posmanager72@info.com   |  posmanager   | POSManager72  |
      | posmanager88@info.com   |  posmanager   | POSManager88  |
      | posmanager96@info.com   |  posmanager   | POSManager96  |
      | posmanager125@info.com  |  posmanager   | POSManager125 |


    @eventCRMmanager
    Examples:
      |          email                |     password        |        name          |
      | eventscrmmanager10@info.com   |  eventscrmmanager   |  EventsCRMManager10  |
      | eventscrmmanager20@info.com   |  eventscrmmanager   |  EventsCRMManager20  |
      | eventscrmmanager30@info.com   |  eventscrmmanager   |  EventsCRMManager30  |
      | eventscrmmanager50@info.com   |  eventscrmmanager   |  EventsCRMManager50  |
      | eventscrmmanager100@info.com  |  eventscrmmanager   |  EventsCRMManager100 |


  @B29G17-227
  Scenario Outline: Negative login scenario
    When User enters incorrect "<invalidEmail>" and "<invalidPassword>"
    And  User click on the login button
    Then User should see a "Wrong login/password" error message

    Examples:

      |    invalidEmail        |    invalidPassword   |
      |   mibshgy25@info.com   |    uhdgvdggvcdg      |
      |   kjgg5@gmail.com      |    ddvbgnhnmhmg      |
      |   erch69@mail.com      |    r55msjcbshdb      |

  @B29G17-228
  Scenario: Validation for blank email field
    When User login using blank email field and "password"
    And  User click on the login button
    Then User should see the "Please fill out this field." message should be displayed for blank email field

  @B29G17-229
  Scenario: Validation for blank password field
    When User login using "email" and blank password field
    And User click on the login button
    Then User should see the "Please fill out this field." message should be displayed for blank password field
