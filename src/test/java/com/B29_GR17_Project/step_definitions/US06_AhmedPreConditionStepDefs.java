package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.AhmedHomePage;
import com.B29_GR17_Project.pages.AhmedLoginPage;
import com.B29_GR17_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_AhmedPreConditionStepDefs {

      AhmedLoginPage loginPage = new AhmedLoginPage();
      AhmedHomePage homePage = new AhmedHomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        BrowserUtils.verifyTitleContains("Login | Best solution for startups");
    }
    @When("user enters valid {string}")
    public void user_enters_valid(String email) {
        loginPage.emailInput.sendKeys(email);
    }
    @When("user enters a valid {string}")
    public void user_enters_a_valid(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks log in button")
    public void user_clicks_log_in_button() {
        loginPage.loginBtn.click();
    }
    @When("user clicks point of sale")
    public void user_clicks_point_of_sale() {
       homePage.posBtn.click();
    }
    @When("user clicks product")
    public void user_clicks_product() {
        homePage.productsBtn.click();
    }
    @Then("user is on products page")
    public void user_is_on_products_page() {
        BrowserUtils.verifyTitleContains("Odoo");
    }

}
