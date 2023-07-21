package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US09_SalemLoginPage {
    public US09_SalemLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="login")
    public WebElement userName;



    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement summit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        summit.click();
        // verification that we logged
    }


}