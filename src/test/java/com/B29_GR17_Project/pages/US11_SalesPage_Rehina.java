package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US11_SalesPage_Rehina {
    public US11_SalesPage_Rehina() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath ="//a[@data-menu='445']//span[contains (text (),'Sales')]")
    public WebElement salesPage;

    @FindBy(xpath ="/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input")
    public WebElement topCheckBox;

    @FindBy(xpath = "//html/body/div[1]/div[2]/div[2]/div/div/div/table//input[@type='checkbox']")
    public List<WebElement> allCheckBoxes;
}


