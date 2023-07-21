package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage_08_Yevheniia {

    public BasePage_08_Yevheniia(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath="//*[@id=\"oe_main_menu_navbar\"]/div//li[contains(.,'Repairs')]")

     public WebElement topMenuRepairsButton;

}
