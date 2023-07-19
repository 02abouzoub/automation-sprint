Feature: Accessing different modules
  US:As an Inventory manager, I should be able to access the main modules


  Scenario Outline: Login as inventory manager
    Given user is on the login page
    When user enters "<email>","<password>"
    And user clicks on the login button
    Then user should see all  modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Inventory       |
      | Manufacturing   |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards      |
    Examples:
      | email           | password         |
      | imm12@info.com  | inventorymanager |
      | imm38@info.com  | inventorymanager |
      | imm57@info.com  | inventorymanager |
      | imm81@info.com  | inventorymanager |
      | imm101@info.com | inventorymanager |
      | imm120@info.com | inventorymanager |
      | imm153@info.com | inventorymanager |





