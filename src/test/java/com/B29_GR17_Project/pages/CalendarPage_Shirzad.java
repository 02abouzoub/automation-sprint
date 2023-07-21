package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage_Shirzad {

    public CalendarPage_Shirzad() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//td[@class='fc-widget-content']//td[@class='fc-widget-content']")
    public List<WebElement> hourlyBoxes;

    @FindBy(xpath = "//div[@class='fc-day-grid fc-unselectable']//div[@class='fc-bg']//td")
    public List<WebElement> dailyBoxes;

    @FindBy(xpath = "//div[@class='modal o_technical_modal in']")
    public WebElement eventCreationPopup;

    @FindBy(className = "close")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@class='modal o_technical_modal in']")
    public WebElement eventDetails;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement summaryInput;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//div[@class='fc-event-container']//div[@class='fc-bg']")
    public WebElement event;

    @FindBy(xpath = "//button//span[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button//span[.='Ok']")
    public WebElement okButton;

}
