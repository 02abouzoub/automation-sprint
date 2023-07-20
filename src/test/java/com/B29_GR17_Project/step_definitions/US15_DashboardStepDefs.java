package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.LoginPage1YB;
import com.B29_GR17_Project.pages.US15_DashboardPageYB;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US15_DashboardStepDefs {
    LoginPage1YB login = new LoginPage1YB();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string},{string}")
    public void userEnters(String arg0, String arg1) {
        login.login(arg0,arg1);

    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        login.loginButton.click();
    }
    US15_DashboardPageYB dashboardPageYB = new US15_DashboardPageYB();

    @Then("user should see all  modules")
    public void userShouldSeeAllModules(List<String> expected) {

        for (int i = 0 ; i < dashboardPageYB.mainModules.size(); i++ ) {
            Assert.assertEquals(expected.get(i),(dashboardPageYB.mainModules.get(i).getText()));

        }
    }
}
