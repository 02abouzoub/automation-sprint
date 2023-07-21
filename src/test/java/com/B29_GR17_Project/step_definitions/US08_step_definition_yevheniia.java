package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US08_DashBoardPage_Yevheniia;
import com.B29_GR17_Project.pages.US08_LoginPage_Yevheniia;
import com.B29_GR17_Project.pages.US08_RepairsOrderPage_Yevheniia;
import com.B29_GR17_Project.utilities.BrowserUtils;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US08_step_definition_yevheniia {

    US08_RepairsOrderPage_Yevheniia US08RepairsOrderPageYevheniia = new US08_RepairsOrderPage_Yevheniia();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }

    @When("user enters {string} and {string} click on the user button")
    public void user_enters_and_click_on_the_user_button(String email, String password) {

        US08_LoginPage_Yevheniia US08LoginPageYevheniia = new US08_LoginPage_Yevheniia();
        US08LoginPageYevheniia.inputUsername.sendKeys(email);
        US08LoginPageYevheniia.inputPassword.sendKeys(password);
        US08LoginPageYevheniia.loginButton.click();
    }

    @When("user click on the Repairs page")
    public void user_click_on_the_repairs_page() {
        BrowserUtils.sleep(3);
        US08_DashBoardPage_Yevheniia US08DashBoardPageYevheniia = new US08_DashBoardPage_Yevheniia();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(US08DashBoardPageYevheniia.topMenuRepairsButton).perform();
        US08DashBoardPageYevheniia.topMenuRepairsButton.click();
    }

    @Then("system displays columns to view the the repair orders on the Repairs page")
    public void systemDisplaysColumnsToViewTheTheRepairOrdersOnTheRepairsPage(List<String> expectedElements) {
        BrowserUtils.sleep(3);
        US08_RepairsOrderPage_Yevheniia US08RepairsOrderPageYevheniia = new US08_RepairsOrderPage_Yevheniia();
        List<String> actualElements = new ArrayList<>();
        for (int i = 1; i < US08RepairsOrderPageYevheniia.namesOfColumns.size(); i++) {
            actualElements.add(US08RepairsOrderPageYevheniia.namesOfColumns.get(i).getText());
        }
        Assert.assertEquals(expectedElements, actualElements);

    }


    @When("user login with valid credentials {string} and {string}")
    public void userLoginWithValidCredentialsAnd(String email, String password) {
        US08_LoginPage_Yevheniia US08LoginPageYevheniia = new US08_LoginPage_Yevheniia();
        US08LoginPageYevheniia.inputUsername.sendKeys(email);
        US08LoginPageYevheniia.inputPassword.sendKeys(password);
        US08LoginPageYevheniia.loginButton.click();
    }

    @And("user clicks on Repairs link and land on Repair Orders page")
    public void userClicksOnRepairsLinkAndLandOnRepairOrdersPage() {
        BrowserUtils.sleep(3);
        US08_DashBoardPage_Yevheniia US08DashBoardPageYevheniia = new US08_DashBoardPage_Yevheniia();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(US08DashBoardPageYevheniia.topMenuRepairsButton).perform();
        US08DashBoardPageYevheniia.topMenuRepairsButton.click();
    }


    @And("user type a {string} in the search box and click")
    public void userTypeAInTheSearchBoxAndClick(String referenceData) {

        US08RepairsOrderPageYevheniia.searchInput.sendKeys(referenceData);
        US08RepairsOrderPageYevheniia.select.click();

    }


    @Then("user should see {string} on the list")
    public void userShouldSeeOnTheList(String expectedOnTheList) {

         Assert.assertEquals(US08RepairsOrderPageYevheniia.result.getText(),expectedOnTheList);
    }
}







