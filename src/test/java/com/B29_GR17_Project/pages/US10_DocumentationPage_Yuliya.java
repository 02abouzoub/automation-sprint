package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US10_DocumentationPage_Yuliya {

    public US10_DocumentationPage_Yuliya(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//li[@class='o_user_menu']")
    public WebElement POSManager5DropDown;

    @FindBy(linkText = "Documentation")
    public WebElement DocumentationButton;

    @FindBy(xpath = "//h1[@class='text-white']")
    public WebElement actualMessage;

    @FindBy(xpath = "/*[@id='o_content']//h2//a")
    public List<WebElement> allTopics;




    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

}
