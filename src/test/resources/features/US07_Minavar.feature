@B29G17-243
Feature: Sales Page Information

  As a POS & Sales Manager,I want to be able to get correct information on the Sales page


@B29G17-241
  Scenario Outline: Verify columns on the Sales page
    Given POS & sales managers log in to the login page
    When user enters "<email>","<password>"
    And user clicks on the login button
    And user on the Sales page
    Then user should see 6 columns to view the quotations on the Sales page

  Examples:

    |         email             |       password       |
    |   posmanager20@info.com   |    posmanager        |
    |   posmanager62@info.com   |    posmanager        |
    |   posmanager99@info.com   |    posmanager        |
    |   posmanager135@info.com  |    posmanager        |
    |   salesmanager9@info.com  |    salesmanager      |
    |   salesmanager15@info.com |    salesmanager      |
    |   salesmanager41@info.com |    salesmanager      |
    |   salesmanager98@info.com |    salesmanager      |


  @B29G17-242
  Scenario Outline: Verify search functionality with Quotation Number
    Given POS & sales managers log in to the login page
    When user enters "<email>","<password>"
    And user clicks on the login button
    And user on the Sales page
    And user search using "<Quotation Number>" data
    Then user should see the search results on the list

    Examples:

      |         email             |       password       |  Quotation Number   |
      |   posmanager20@info.com   |    posmanager        |      SO811          |
      |   posmanager62@info.com   |    posmanager        |      SO752          |
      |   posmanager99@info.com   |    posmanager        |      SO399          |
      |   posmanager135@info.com  |    posmanager        |      SO121          |
      |   salesmanager9@info.com  |    salesmanager      |      SO099          |
      |   salesmanager15@info.com |    salesmanager      |      SO586          |
      |   salesmanager41@info.com |    salesmanager      |      SO197          |
      |   salesmanager98@info.com |    salesmanager      |      SO206          |



