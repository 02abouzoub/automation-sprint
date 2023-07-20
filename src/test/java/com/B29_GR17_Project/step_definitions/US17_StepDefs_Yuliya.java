package com.B29_GR17_Project.step_definitions;

import com.B29_GR17_Project.pages.SalesManagerModulesPage_Yuliya;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;

public class US17_StepDefs_Yuliya {


    SalesManagerModulesPage_Yuliya salesManagerModulesPageYuliya = new SalesManagerModulesPage_Yuliya();

    @When("sales manager logged in with {string} and {string}")
    public void sales_manager_logged_in_with_and(String username, String password) {

        salesManagerModulesPageYuliya.login(username, password);
    }
    @Then("sales manager should see a dashboard with various modules")
    public void sales_manager_should_see_a_dashboard_with_various_modules(List <String> expectedModules) {


        for (int i = 0; i < salesManagerModulesPageYuliya.allModules.size(); i++) {
            Assert.assertEquals(expectedModules.get(i), (salesManagerModulesPageYuliya.allModules.get(i).getText()));

        }
    }

}
