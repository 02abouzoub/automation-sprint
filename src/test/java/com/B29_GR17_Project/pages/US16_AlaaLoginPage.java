package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US16_AlaaLoginPage {

    public US16_AlaaLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='login']")
    public WebElement emailLoginBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void login(String name,String passcode) {
        this.emailLoginBox.sendKeys(name);
        this.passwordBox.sendKeys(passcode);
        //this.loginButton.click();

    }

}

