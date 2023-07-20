package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.LoginPage;
import com.B29_GR17_Project.pages.US11_SalesPage_Rehina;
import com.B29_GR17_Project.utilities.BrowserUtils;
import com.B29_GR17_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_RehinaStepDefs {

    US11_SalesPage_Rehina salesPageRehina = new US11_SalesPage_Rehina();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.briteerp.com/web/login");

    }

    @Given("Users on the sales page")
    public void users_on_the_sales_page() {
        loginPage.login("salesmanager6@info.com", "salesmanager");
        salesPageRehina.salesPage.click();
        BrowserUtils.verifyTitle("Odoo");

    }

    @When("Users click the checkbox on the top")
    public void usersClickTheCheckboxOnTheTop() {
        salesPageRehina.topCheckBox.click();
    }

    @Then("All the quotation should be selected")
    public void allTheQuotationShouldBeSelected() {
        BrowserUtils.sleep(1);
        for (WebElement checkBox : salesPageRehina.allCheckBoxes) {

            Assert.assertEquals(checkBox.isSelected(), true);

        }

    }
}
