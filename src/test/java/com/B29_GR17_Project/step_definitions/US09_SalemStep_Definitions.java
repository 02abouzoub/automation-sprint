package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US09_SalemLoginPage;
import com.B29_GR17_Project.pages.US09_SalemMainPage;
import com.B29_GR17_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US09_SalemStep_Definitions {

    US09_SalemLoginPage us09SalemLoginPage = new US09_SalemLoginPage();
    US09_SalemMainPage us09SalemMainPage = new US09_SalemMainPage();

    @When("use enter {string} and {string}")
    public void use_enter_and(String string, String string2) {

        us09SalemLoginPage.login("posmanager154@info.com", "posmanager");

    }

    @When("user click the point of sale")
    public void user_click_the_point_of_sale() {
        us09SalemMainPage.pointOfSaleButton.click();
    }



    @When("user click the order from dashboard")
    public void user_click_the_order_from_dashboard() {
        us09SalemMainPage.ordersButton.click();

    }

   @When("user click the order Ref box")
    public void user_click_the_order_ref_box() {

        us09SalemMainPage.orderRefButton.click();

    }

    @Then("verify all {string} are checked")
    public void verify_all_are_checked(String expectedBoxes) {


        for (int i = 3; i < us09SalemMainPage.box.size(); i++) {
            Assert.assertTrue(us09SalemMainPage.box.get(i).isSelected());

        }

    }


    @Given("the user is able to click the action button")
    public void the_user_is_able_to_click_the_action_button() {

        BrowserUtils.sleep(1);
        us09SalemMainPage.ActionDropdown.click();
        BrowserUtils.sleep(1);

    }
    @Then("user is able to see below options")
    public void user_is_able_to_see_below_options(List<String> expectedLinks) {
        for (int i = 0; i < us09SalemMainPage.allLinks.size(); i++) {
            Assert.assertEquals(expectedLinks.get(i),(us09SalemMainPage.allLinks.get(i).getText()));
        }


    }



}
