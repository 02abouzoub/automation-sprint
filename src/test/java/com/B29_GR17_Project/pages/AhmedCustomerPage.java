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


    @FindBy(xpath = "//img[@modifiers='{}']")
    public WebElement customer1;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@placeholder='Street...']")
    public WebElement addressBox;

    @FindBy(xpath = "//input[@placeholder='Street 2...']")
    public WebElement addressBoxContinue;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@placeholder='S\uFEFFt\uFEFFa\uFEFFt\uFEFFe']")
    public WebElement stateDropdown;

    @FindBy(xpath = "//ul[@style='display: none; top: 427.969px; left: 468.281px; width: 164px;']/li[1]")
    public WebElement stateSelect;


    @FindBy(xpath = "//input[@placeholder='ZIP']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@placeholder='C\uFEFFo\uFEFFu\uFEFFn\uFEFFt\uFEFFr\uFEFFy']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@placeholder='e.g. BE0477472701']")
    public WebElement taxIdNumber;

    @FindBy(xpath = "//input[@placeholder='T\uFEFFa\uFEFFg\uFEFFs\uFEFF.\uFEFF.\uFEFF.']")
    public WebElement tagsDropdown;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement customerEmail;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement customerWebsite;

    @FindBy(xpath = "//select[@name='lang']")
    public WebElement languageDropdown;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;



}
