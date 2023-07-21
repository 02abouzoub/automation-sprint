package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.LoginPage_Minavar;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_MinavarStepDefinitions {

    LoginPage_Minavar loginPage = new LoginPage_Minavar();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("User enters correct {string} and {string}")
    public void userEntersCorrectAnd(String email, String password) {
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
    }


    @And("User click to the login button")
    public void userClickToTheLoginButton() {
        loginPage.loginButton.click();
    }


    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedName) {

        String actualName = loginPage.name.getText();
        // System.out.println(actualName);

        Assert.assertEquals(actualName, expectedName);


    }


    @When("User enters incorrect {string} and {string}")
    public void userEntersIncorrectAnd(String invalidEmail, String invalidPassword) {
        loginPage.emailInput.sendKeys(invalidEmail);
        loginPage.passwordInput.sendKeys(invalidPassword);
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User should see a {string} error message")
    public void userShouldSeeAWrongLoginPasswordErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage =loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


    @When("User login using blank email field and {string}")
    public void userLoginUsingBlankEmailFieldAnd(String password) {
        loginPage.passwordInput.sendKeys("eventscrmmanager");

    }

    @Then("User should see the {string} message should be displayed for blank email field")
    public void userShouldSeeTheMessageShouldBeDisplayedForBlankEmailField(String expectedMsg) {
        String actualMsg = loginPage.emailInput.getAttribute("validationMessage");
        //System.out.println(actualMsg);

        Assert.assertEquals(expectedMsg,actualMsg);

    }

    @When("User login using {string} and blank password field")
    public void userLoginUsingAndBlankPasswordField(String email) {
        loginPage.emailInput.sendKeys("posmanager105");
    }

    @Then("User should see the {string} message should be displayed for blank password field")
    public void userShouldSeeTheMessageShouldBeDisplayedForBlankPasswordField(String expectedMsg) {
        String actualMsg = loginPage.passwordInput.getAttribute("validationMessage");
        //System.out.println(actualMsg);

        Assert.assertEquals(expectedMsg,actualMsg);

    }
}
