package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US14_DashboardPageYB;
import com.B29_GR17_Project.pages.US14_LoginPageYB;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US14_YoussefStepDefs {

    US14_LoginPageYB US14LoginPageYB = new US14_LoginPageYB();
    US14_DashboardPageYB US14DashboardPageYB = new US14_DashboardPageYB();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string},{string}")
    public void userEnters(String arg0, String arg1) {
        US14LoginPageYB.login(arg0,arg1);
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        US14LoginPageYB.loginButton.click();
    }


    @Then("user should see all  modules")
    public void userShouldSeeAllModules(List<String> expected) {

        for (int i = 0; i < US14DashboardPageYB.mainModules.size(); i++ ) {
            Assert.assertEquals(expected.get(i),(US14DashboardPageYB.mainModules.get(i).getText()));

        }





    }
}
