package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesManagerModulesPage_Yuliya {


    public SalesManagerModulesPage_Yuliya(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "login")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//li[@style='display: block;']/a/span")
    public List<WebElement> allModules;

    public void login(String username, String password){
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
