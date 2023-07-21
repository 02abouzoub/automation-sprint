package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US09_SalemMainPage {

    public US09_SalemMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a")
    public WebElement pointOfSaleButton;


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[1]/a/span")

    public WebElement ordersButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input")
    public WebElement orderRefButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> box;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement  ActionDropdown;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[4]/li")
    public List<WebElement> allLinks;
}
