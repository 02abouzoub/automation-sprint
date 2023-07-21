Feature: Accessing Different Modules
  As a sales manager
  I should be able to access the different modules

  Scenario Outline: Sales manager accesses different modules
    When  sales manager logged in with "<username>" and "<password>"
    Then sales manager should see a dashboard with various modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |


    Examples:
      | username                 | password     |
      | salesmanager7@info.com   | salesmanager |
      | salesmanager25@info.com  | salesmanager |
      | salesmanager46@info.com  | salesmanager |
      | salesmanager67@info.com  | salesmanager |
      | salesmanager78@info.com  | salesmanager |
      | salesmanager85@info.com  | salesmanager |
      | salesmanager101@info.com | salesmanager |