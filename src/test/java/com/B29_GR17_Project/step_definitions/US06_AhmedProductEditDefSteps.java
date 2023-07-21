package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.AhmedPoductPage;

import com.B29_GR17_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US06_AhmedProductEditDefSteps {

    AhmedPoductPage productsPage = new AhmedPoductPage();

    @Then("user chooses a product")
    public void user_chooses_a_product() {
        productsPage.productSelection.click();
    }
    @Then("user clicks edit button")
    public void user_clicks_edit_button() {
        productsPage.editBtn.click();
    }
    @Then("user edits product information")
    public void user_edits_product_information() {

        productsPage.productNameBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"Playstation3");

        productsPage.checkbox1.click();
        productsPage.checkbox2.click();
        productsPage.checkbox3.click();

       // Select ptypeDropdown = new Select(productsPage.productTypeDropdown);
       // ptypeDropdown.selectByIndex(2);

       //  Select categDropdown = new Select(productsPage.categoryDropdown);
       // categDropdown.selectByIndex(3);

        productsPage.internalRefBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"123487kk");

        productsPage.barcodeBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"5587433ab");

    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        productsPage.saveBtn.click();
        productsPage.productName.isDisplayed();
    }
}
