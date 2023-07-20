package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AhmedHomePage {

    public AhmedHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement inboxMsg;

    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    public WebElement salesPageBtn;

    @FindBy(xpath = "//a[@href='/web#menu_id=484&action=']")
    public WebElement posBtn;

    @FindBy(xpath = "//a[@href='/web#menu_id=491&action=669']")
    public WebElement productsBtn;

}
