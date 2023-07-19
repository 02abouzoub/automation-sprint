package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.DashboardPageYB;
import com.B29_GR17_Project.pages.LoginPageYB;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US14_YoussefStepDefs {

    LoginPageYB loginPageYB = new LoginPageYB();
    DashboardPageYB dashboardPageYB = new DashboardPageYB();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string},{string}")
    public void userEnters(String arg0, String arg1) {
        loginPageYB.login(arg0,arg1);
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        loginPageYB.loginButton.click();
    }


    @Then("user should see all  modules")
    public void userShouldSeeAllModules(List<String> expected) {

        for (int i = 0 ; i < dashboardPageYB.mainModules.size(); i++ ) {
            Assert.assertEquals(expected.get(i),(dashboardPageYB.mainModules.get(i).getText()));

        }





    }
}
