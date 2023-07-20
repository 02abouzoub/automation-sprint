Feature: Accessing Different Modules
  As a sales manager
  I should be able to access the different modules

  Scenario Outline: Sales manager accesses different modules
    Given sales manager logged in with "<username>" and "<password>"
    When I log in to the system
    Then I should see a dashboard with access to various modules

    Examples: