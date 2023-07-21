package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.AhmedProductsPage;
import com.B29_GR17_Project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_AhmedProductCreationStepDefs {

    AhmedProductsPage productsPage = new AhmedProductsPage();

    @When("user clicks create button")
    public void user_clicks_create_button(){
        productsPage.createBtn.click();
    }

    @And("user enters a {string}")
    public void user_enters_a(String productName) {
        productsPage.productNameBox.sendKeys(productName);
    }

    @And("user clicks the save button")
    public void user_clicks_the_save_button() {
        productsPage.saveBtn.click();
    }

    @Then("user can see new product displayed")
    public void user_can_see_new_product_displayed() {
        productsPage.productName.isDisplayed();
    }
}
