package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage_Minavar {

    public SalesPage_Minavar(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@data-menu='445']//span")
    public WebElement Sales;

    @FindBy(xpath = "//li[.='Quotations']")
    public WebElement Quotations;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> columns;

    @FindBy(className = "o_searchview_input")
    public WebElement searchInput;

    @FindBy(className = "o-selection-focus")
    public WebElement select;
    @FindBy(xpath = "//tr[@class='o_data_row']//td")
    public WebElement columnsResult;
}
