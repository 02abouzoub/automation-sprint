package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Minavar {

   public LoginPage_Minavar() {
       PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(id="login")
    public WebElement emailInput;

   @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement name;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    public void login(String emailStr, String passwordStr) {
        emailInput.sendKeys(emailStr);
        passwordInput.sendKeys(passwordStr);
        loginButton.click();
    }
}
