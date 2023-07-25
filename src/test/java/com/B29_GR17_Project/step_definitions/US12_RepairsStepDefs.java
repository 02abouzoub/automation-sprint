package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US12_RepairsPage_IA;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class US12_RepairsStepDefs {

    US12_RepairsPage_IA repairsPage = new US12_RepairsPage_IA();

    @Given("user in the login page")
    public void user_in_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("the user login with valid {string},{string}")
    public void theUserLoginWithValid(String email, String password) {
        repairsPage.loginAndClick(email, password);
    }

    @And("user clicks on the repair button in the dashboard")
    public void userClicksOnTheRepairButtonInTheDashboard() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(repairsPage.repairsPageButton));


        repairsPage.repairsPageButton.click();

    }


    @And("user click on the first checkbox")
    public void userClickOnTheFirstCheckbox() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(repairsPage.topRepairOrdersCheckBox));

        repairsPage.topRepairOrdersCheckBox.click();

    }

    @Then("user is able to select all repair orders")
    public void userIsAbleToSelectAllRepairOrders() {

        List<WebElement> actual= repairsPage.allRepairOrders;

        for (WebElement each:actual){

            WebDriverWait wait= new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeSelected(each));

            Assert.assertTrue(each.isSelected());
            System.out.println("each.isSelected() = " + each.isSelected());
        }
    }
}