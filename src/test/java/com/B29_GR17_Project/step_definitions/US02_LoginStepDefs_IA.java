package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.US02_LoginPage_IA;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class US02_LoginStepDefs_IA {
    US02_LoginPage_IA loginPage = new US02_LoginPage_IA();

    @Given("User is on the login page")
    public void User_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("the user login with {string},{string}")
    public void theUserLoginWith(String email, String password) {
        loginPage.loginAndClick(email, password);
    }

    @Then("user sees account holder name is {string}")
    public void userSeesAccountHolderNameIs(String expectedUserName) {
        String actualUsername = loginPage.userName.getText();

        Assert.assertEquals(expectedUserName,actualUsername);

    }

    @When("the user login with {string},{string} and hit the Enter key")
    public void theUserLoginWithAndHitTheEnterKey(String email, String password) {
        loginPage.loginAndEnter(email, password);
    }

    @When("the user login with the {string},{string}")
    public void theUserLoginWithThe(String invalidUsername, String invalidPassword) {
        loginPage.loginAndClick(invalidUsername, invalidPassword);
    }


    @Then("{string} error message")
    public void errorMessage(String expectedErrorMsg) {
        String actualErrorMsg = loginPage.invalidLoginErrorMessage.getText();

        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
    }


    @When("user login with {string} and leaves password field blank")
    public void userLoginWithAndBlankPasswordField(String email) {
        loginPage.emailInputField.sendKeys(email);
        loginPage.loginBtn.click();
    }

    @Then("user sees {string} message from password field")
    public void userSeesMessageFromPasswordField(String expectedErrorMsg) {

        String ActualMsg = loginPage.passwordInputField.getAttribute("validationMessage");

        Assert.assertEquals (expectedErrorMsg,ActualMsg);
    }

    @When("user login with {string} and leave email field blank")
    public void userLoginWithAndLeaveEmailFieldBlank(String password) {
        loginPage.passwordInputField.sendKeys(password);

        loginPage.loginBtn.click();
    }


    @Then("user sees {string} message from email field")
    public void userSeesMessageFromEmailField(String expectedErrorMsg) {

        String actualErrorMsg = loginPage.emailInputField.getAttribute("validationMessage");

        Assert.assertEquals (expectedErrorMsg,actualErrorMsg);

    }

}
