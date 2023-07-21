package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US16_AlaaLoginPage;
import com.B29_GR17_Project.pages.US16_ExpensesModuleAlaa;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US16_AlaaStepsDefs {

    US16_AlaaLoginPage loginPage = new US16_AlaaLoginPage();
    US16_ExpensesModuleAlaa expensesModuleAlaa = new US16_ExpensesModuleAlaa();

    @Given("user in on the login page")
    public void user_in_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enters {string},{string}")
    public void user_enters(String name, String password) {
        loginPage.login(name, password);
    }

    @When("user click in the login button")
    public void user_click_in_the_login_button() {
        loginPage.loginButton.click();

    }

    @Then("user should see the modules bellow")
    public void user_should_see_the_modules_bellow(List<String> expected) {


        for (int i = 0; i < expensesModuleAlaa.allModules.size(); i++) {
            Assert.assertEquals(expected.get(i), expensesModuleAlaa.allModules.get(i).getText());

        }


    }


}
