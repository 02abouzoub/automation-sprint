package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.AhmedCustomerPage;
import com.B29_GR17_Project.pages.AhmedHomePage;
import com.B29_GR17_Project.pages.AhmedLoginPage;
import com.B29_GR17_Project.pages.AhmedSalesPage;
import com.B29_GR17_Project.utilities.BrowserUtils;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class US05AC02_AhmedEditInfoStepDefs {

    AhmedSalesPage salesPage = new AhmedSalesPage();
    AhmedHomePage homePage = new AhmedHomePage();
    AhmedLoginPage loginPage = new AhmedLoginPage();
    AhmedCustomerPage customerPage = new AhmedCustomerPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        BrowserUtils.verifyTitle("Login | Best solution for startups");
    }
    @When("user enter valid {string}")
    public void user_enter_valid(String emailAddress) {
        loginPage.emailInput.sendKeys(emailAddress);
    }
    @When("user enter a valid {string}")
    public void user_enter_a_valid(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user click log in button")
    public void user_click_log_in_button() {
        loginPage.loginBtn.click();
    }
    @Then("user click sales")
    public void user_click_sales() {
        homePage.salesPageBtn.click();
        BrowserUtils.verifyTitleContains("Odoo");
    }
    @When("user is on sales module page")
    public void user_is_on_sales_module_page() {
        BrowserUtils.verifyTitleContains("Odoo");
    }
    @When("user click on customers tab")
    public void user_click_on_customers_tab() {
        salesPage.customersTab.click();
    }


    @Given("user is on customer page")
    public void user_is_on_customer_page() {
        BrowserUtils.verifyTitleContains("Odoo");
    }

    @When("user chooses a customer from customers page")
    public void user_chooses_a_customer_from_customers_page() {
        customerPage.customer1.click();
    }
    @And("user clicks the edit button")
    public void user_clicks_the_edit_button() {
        customerPage.editBtn.click();
    }
    @Then("user should be able to edit all customer information entered")
    public void user_should_be_able_to_edit_all_customer_information_entered() {

        customerPage.nameBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"Johnny dawg");

        customerPage.addressBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"345 tiwtiw rd");

        customerPage.addressBoxContinue.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"apt 301");

        customerPage.cityBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"Mawkley");

        //Select stateDropdown = new Select(Driver.getDriver().findElement(By.xpath("//input[@placeholder='S\uFEFFt\uFEFFa\uFEFFt\uFEFFe']")));
        //stateDropdown.selectByIndex(1);


        customerPage.zipCode.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"23498");

       // Select countryDropdown = new Select(customerPage.countryDropdown);
        //countryDropdown.selectByIndex(2);

        customerPage.taxIdNumber.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"TIN253648");

       // Select tagsDropdown = new Select(customerPage.tagsDropdown);
       // tagsDropdown.selectByIndex(1);

        customerPage.phoneNumber.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"746-555-8923");

        customerPage.customerEmail.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"customer1@email.net");

        customerPage.customerWebsite.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"www.customer1.com");

        Select languageDropdown = new Select(customerPage.languageDropdown);
        languageDropdown.selectByValue("\"en_US\"");

        customerPage.saveBtn.click();
    }

}
