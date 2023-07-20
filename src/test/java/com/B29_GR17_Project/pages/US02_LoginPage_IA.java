package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_LoginPage_IA {

    public US02_LoginPage_IA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement userNameInputField;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement invalidLoginErrorMessage;

    @FindBy(xpath = "//li[@class='active']//span")
    public WebElement repairsPageBtn;


    @FindBy(xpath = "//div[contains(@class, 'clearfix')]")
    public WebElement hidden3;

    public void loginAndClick(String username, String password) {
        userNameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginBtn.click();
    }
    public void loginAndEnter(String username, String password) {
        userNameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginBtn.sendKeys(Keys.ENTER);
    }
}
