package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.LoginPage;
import com.B29_GR17_Project.pages.US10_DocumentationPage_Yuliya;
import com.B29_GR17_Project.utilities.BrowserUtils;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US10_StepDefinitionsYuliya {

    US10_DocumentationPage_Yuliya documentationPage = new US10_DocumentationPage_Yuliya();

    @Given("user logged in with {string} and {string}")
    public void user_logged_in_with_and(String username, String password) {
        documentationPage.login(username,password);
    }

    @When("user accesses the documentation page")
    public void user_accesses_the_documentation_page() {

        documentationPage.POSManager5DropDown.click();
        documentationPage.DocumentationButton.click();

    }


    @When("user should see the {string} message in the new window")
    public void user_should_see_the_message_in_the_new_window(String expectedMessage) {

        String parentWindow = Driver.getDriver().getWindowHandle();
        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowHandle);
        }

        BrowserUtils.sleep(3);

        String actualMessage = documentationPage.actualMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }


    @Then("user should see four main topics")
    public void user_should_see_four_main_topics(List <String> expectedTopics) {

        for (int i = 0; i < documentationPage.allTopics.size(); i++) {
            Assert.assertEquals(expectedTopics.get(i), (documentationPage.allTopics.get(i).getText()));
        }
    }

        /*for (WebElement eachTopic : documentationPage.allTopics){

            System.out.println("eachTopic.getText() = " + eachTopic.getText());
            Assert.assertEquals(expectedTopics,documentationPage.allTopics);


        }*/
    }


