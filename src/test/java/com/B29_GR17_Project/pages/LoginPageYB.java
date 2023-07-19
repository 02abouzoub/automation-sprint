package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPageYB {

    public LoginPageYB(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailSpan ;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordSpan;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


    public void login(String email, String password){
        emailSpan.sendKeys(email);
        passwordSpan.sendKeys(password);


    }

}
