package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.LoginPage_Minavar;
import com.B29_GR17_Project.pages.SalesPage_Minavar;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_MinavarStepDefinitions {

    LoginPage_Minavar loginPage = new LoginPage_Minavar();

    SalesPage_Minavar salesPage = new SalesPage_Minavar();


    @Given("POS & sales managers log in to the login page")
    public void posSalesManagersLogInToTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string},{string}")
    public void user_enters(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();

    }

    @And("user on the Sales page")
    public void userOnTheSalesPage() {
        salesPage.Sales.click();
        Assert.assertTrue(salesPage.Quotations.isDisplayed());
        //System.out.println(salesPage.Quotations.getText());
    }

    @Then("user should see {int} columns to view the quotations on the Sales page")
    public void user_should_see_columns_to_view_the_quotations_on_the_sales_page(int expectedNum) {
        List<WebElement> cols = new ArrayList<>(salesPage.columns);

        int actualNum = cols.size();
        //System.out.println(actualNum);

        Assert.assertEquals(expectedNum,actualNum);

     /*   for (WebElement each : cols) {
            String eachName = each.getText();
            System.out.println(eachName);
        }   */


    }

    @And("user search using {string} data")
    public void userSearchUsingData(String QNumber) {

        salesPage.searchInput.sendKeys(QNumber);
        salesPage.select.click();
    }

    @Then("user should see the search results on the list")
    public void userShouldSeeTheSearchResultsOnTheList() {

        Assert.assertTrue(salesPage.columnsResult.isDisplayed());
    }




}
