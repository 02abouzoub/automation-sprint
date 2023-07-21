package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage_Shirzad_US13 {

    public BasePage_Shirzad_US13() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='120']//span[contains (text (),'Calendar')]")
    public WebElement calendarLink;

    @FindBy(xpath = "//li[@style='display: block;']//span")
    public List<WebElement> modules;


}
