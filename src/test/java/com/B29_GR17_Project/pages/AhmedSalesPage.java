package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AhmedSalesPage {

    public AhmedSalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='447']")
    public WebElement customersTab;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@ placeholder='Name']")
    public WebElement customerNameInput;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;



    @FindBy(xpath = "//h1")
    public WebElement customerName;


}