package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AhmedCustomerPage {

    public AhmedCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(partialLinkText = "id=3392&unique=")
    public WebElement customer1;

    @FindBy(partialLinkText = "id=4202&unique=")
    public WebElement customer2;

    @FindBy(partialLinkText = "id=3146&unique=")
    public WebElement customer3;

    @FindBy(partialLinkText = "id=3378&unique=")
    public WebElement customer4;

    @FindBy(partialLinkText = "id=3119&unique=")
    public WebElement customer5;

    @FindBy(partialLinkText = "id=9&unique=")
    public WebElement customer6;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;

    @FindBy(id = "o_field_input_1911")
    public WebElement nameBox;

    @FindBy(id = "o_field_input_1915")
    public WebElement addressBox;

    @FindBy(id = "o_field_input_1916")
    public WebElement addressBoxContinue;

    @FindBy(id = "o_field_input_1917")
    public WebElement cityBox;

    @FindBy(id = "o_field_input_1918")
    public WebElement stateDropdown;

    @FindBy(id = "o_field_input_1919")
    public WebElement zipCode;

    @FindBy(id = "o_field_input_1920")
    public WebElement countryDropdown;

    @FindBy(id = "o_field_input_1921")
    public WebElement taxIdNumber;

    @FindBy(id = "o_field_input_1922")
    public WebElement tagsDropdown;

    @FindBy(id = "o_field_input_1924")
    public WebElement phoneNumber;

    @FindBy(id = "o_field_input_1925")
    public WebElement mobileNumber;

    @FindBy(id = "o_field_input_1927")
    public WebElement customerEmail;

    @FindBy(id = "o_field_input_1928")
    public WebElement customerWebsite;

    @FindBy(id = "o_field_input_1930")
    public WebElement languageDropdown;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;



}
