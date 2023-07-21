package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.BasePage_Shirzad_US13;
import com.B29_GR17_Project.pages.LoginPage_Shirzad_US13;
import com.B29_GR17_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_ShirzadStepDefs {

    LoginPage_Shirzad_US13 loginPage = new LoginPage_Shirzad_US13();
    BasePage_Shirzad_US13 basePage = new BasePage_Shirzad_US13();

    @When("User is on the base page")
    public void user_is_on_the_base_page() {

        BrowserUtils.verifyTitle("Odoo");


    }

    @Then("User should see {int} modules")
    public void user_should_see_modules(Integer expectedNumber) {

        Integer actualNumber = basePage.modules.size();

        Assert.assertEquals(actualNumber, expectedNumber);

    }


}
