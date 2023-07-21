package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.*;
import com.B29_GR17_Project.utilities.ConfigurationReader;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US04_ShirzadStepDefs {

    LoginPage_Shirzad_US04 loginPage = new LoginPage_Shirzad_US04();
    BasePage_Shirzad_US04 basePage = new BasePage_Shirzad_US04();
    CalendarPage_Shirzad calendarPage = new CalendarPage_Shirzad();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User logs in with {string}, {string}")
    public void userLogsInWith(String email, String password) {
        loginPage.login(email, password);
    }

    @Given("User goes to  the calendar page")
    public void user_goes_to_the_calendar_page() {

        basePage.calendarLink.click();

    }

    @When("User clicks on time box")
    public void user_clicks_on_time_box() {

        // I didn't use clicking part here, because it was needed to be inside the loop

    }


    @Then("User should create an event")
    public void user_should_create_an_event() {

        for (int i = 1; i < calendarPage.dailyBoxes.size(); i++) {

            calendarPage.dailyBoxes.get(i).click();
            Assert.assertTrue(calendarPage.eventCreationPopup.isDisplayed());
            calendarPage.closeButton.click();

        }


        for (WebElement hourlyBox : calendarPage.hourlyBoxes) {
            hourlyBox.click();
            Assert.assertTrue(calendarPage.eventCreationPopup.isDisplayed());
            calendarPage.closeButton.click();

        }


    }

    @When("User creates the event at {string} on the calendar")
    public void userCreatesTheEventAtOnTheCalendar(String time) {

        calendarPage.hourlyBoxes.get(Integer.parseInt(time)).click();
        calendarPage.summaryInput.sendKeys("" + time);
        calendarPage.createButton.click();
    }

    @And("User clicks the event")
    public void userClicksTheEventAt() {

        calendarPage.event.click();


    }


    @Then("User should see event details")
    public void user_should_see_event_details() {

        Assert.assertTrue(calendarPage.eventDetails.isDisplayed());
        calendarPage.deleteButton.click();
        calendarPage.okButton.click();

    }

}
