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


    @When("the user login with either {string} or {string}")
    public void theUserLoginWithEitherOr(String blankUserName, String blankPassword) {
        loginPage.loginAndClick(blankUserName, blankPassword);
    }


    @Then("user sees {string} message")
    public void userSeesMessage(String expectedErrorMsg) {

        String emailInputFieldActualMsg = loginPage.emailInputField.getAttribute("validationMessage");
        String passwordInputFieldActualMsg = loginPage.passwordInputField.getAttribute("validationMessage");

        System.out.println("emailInputFieldActualMsg = " + emailInputFieldActualMsg);
        System.out.println("passwordInputFieldActualMsg = " + passwordInputFieldActualMsg);

       /*  if ((passwordInputFieldActualMsg.equals(expectedErrorMsg) || emailInputFieldActualMsg.equals(expectedErrorMsg))) {
          Assert.assertTrue(true);
          }

       */
        Assert.assertTrue ((expectedErrorMsg.equals(passwordInputFieldActualMsg) || expectedErrorMsg.equals(emailInputFieldActualMsg))) ;



    }
}
