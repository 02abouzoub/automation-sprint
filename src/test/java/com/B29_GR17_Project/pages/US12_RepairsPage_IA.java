package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US12_RepairsPage_IA {
    public US12_RepairsPage_IA(){
       PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//input[@id='login']")
    public WebElement userNameInputField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginBtn;



    @FindBy(xpath = "//li[@class='active']//span")
    public WebElement repairsPageBtn;




    public void loginAndClick(String username, String password) {
        userNameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginBtn.click();
    }
    @FindBy (xpath = "//th[@class='o_list_record_selector']")
    public WebElement topRepairOrdersCheckBox;


    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> allRepairOrders;

    @FindBy(css = "a[data-menu='535'] span[class='oe_menu_text']")
    public WebElement repairsPageButton;

}

