package com.B29_GR17_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US08_RepairsOrderPage_Yevheniia extends BasePage_08_Yevheniia {

    @FindBy(xpath = "//table//tr/th")

    public List<WebElement> namesOfColumns;


@FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInput;

@FindBy(className = "o-selection-focus")
    public WebElement select;


@FindBy(xpath = "//tr[@class='o_data_row']//td[2]")

    public WebElement result;

}
