package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AhmedPoductPage {

    public AhmedPoductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement productNameBox;

    @FindBy(xpath = "//div[@name='options']/div[1]/div")
    public WebElement checkbox1;

    @FindBy(xpath = "//div[@name='options']/div[2]/div")
    public WebElement checkbox2;

    @FindBy(xpath = "//div[@name='options']/div[3]/div")
    public WebElement checkbox3;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[1]/tbody/tr[1]/td[2]/select")
    public WebElement productTypeDropdown;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[1]/tbody/tr[2]/td[2]/div/div/input")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[1]/tbody/tr[3]/td[2]/input")
    public WebElement internalRefBox;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[1]/tbody/tr[4]/td[2]/input")
    public WebElement barcodeBox;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[2]/tbody/tr[1]/td[2]/div")
    public WebElement salesPriceBox;

    @FindBy(xpath = "//div[@class='tab-pane active']/div/table[2]/tbody/tr[5]/td[2]/div/div/div")
    public WebElement costBox;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[3]")
    public WebElement salesSection;

    @FindBy(xpath = "//h1")
    public WebElement productName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createBtn;

    @FindBy(xpath = "//img[@modifiers='{}']")
    public WebElement productSelection;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;













}
