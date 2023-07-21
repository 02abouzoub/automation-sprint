package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.AhmedHomePage;
import com.B29_GR17_Project.pages.AhmedLoginPage;
import com.B29_GR17_Project.pages.AhmedSalesPage;
import com.B29_GR17_Project.utilities.BrowserUtils;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US05AC01_AhmedCreateCustomerStepDefs {
    AhmedLoginPage loginPage = new AhmedLoginPage();
    AhmedHomePage homePage = new AhmedHomePage();

    AhmedSalesPage salesPage = new AhmedSalesPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        BrowserUtils.verifyTitle("Login | Best solution for startups");
    }
    @When("user enters valid {string}")
    public void user_enters_valid_email(String emailAddress) {
        loginPage.emailInput.sendKeys(emailAddress);
    }
    @When("user enters a valid {string}")
    public void user_enters_valid_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @When("user clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.loginBtn.click();
    }
    @Then("user should land on inbox page")
    public void user_should_land_on_inbox_page() {
        BrowserUtils.verifyTitleContains("Odoo");
    }
    @Then("user click on sales")
    public void user_click_on_sales() {
        homePage.salesPageBtn.click();
        BrowserUtils.verifyTitleContains("Odoo");
    }

    @When("user is on Sales module page")
    public void user_is_on_sales_module_page() {
        BrowserUtils.verifyTitleContains("Odoo");
    }

    @When("user clicks on customers tab")
    public void user_clicks_on_customers_tab() {
        salesPage.customersTab.click();
    }
    @When("user clicks on create")
    public void user_clicks_on_create() {
        salesPage.createBtn.click();
    }
    @And("user fills out {string}")
    public void user_fills_out_name(String name) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@ placeholder='Name']")));
        salesPage.customerNameInput.sendKeys(name);
    }
    @When("user clicks save")
    public void user_clicks_save() {
        salesPage.saveBtn.click();
    }

    @Then("user sees customer information displayed")
    public void user_sees_customer_information_displayed() {
        salesPage.customerName.isDisplayed();
    }


}