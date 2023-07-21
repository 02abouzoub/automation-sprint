package com.B29_GR17_Project.pages;

import com.B29_GR17_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US16_ExpensesModuleAlaa {

public US16_ExpensesModuleAlaa(){

    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//li[@style='display: block;']")
public List<WebElement> allModules;



 //@FindBy(className = "navbar-header")
//public WebElement moduleHeader;

//@FindBy(xpath = "//a[@href='/web#menu_id=115&action=120']")
   // public WebElement DiscussModule;

//@FindBy(xpath = "//a[@href='/web#menu_id=120&action=136']")
    //public WebElement CalendarModule;

//@FindBy(xpath = "//a[href='/web#menu_id=194&action=220']")
    //public WebElement NotesModule;

//@FindBy(xpath = "//a[href='/web#menu_id=68&action=']")
   // public WebElement ContactsModule;

    //@FindBy(xpath = "//a[href='/web#menu_id=382&action=']")
   // public WebElement WebsiteModule;

    //@FindBy(xpath = "//a[href='/web#menu_id=124&action=']")
   // public WebElement EventsModule;

    //@FindBy(xpath = "//a[href='/web#menu_id=157&action=']")
   // public WebElement EmployeesModule;

   // @FindBy(xpath = "//a[href='/web#menu_id=295&action=']")
    //public WebElement LeavesModule;

    //@FindBy(xpath = "//a[href='/web#menu_id=388&action=']")
  //  public WebElement ExpensesModule;

   // @FindBy(xpath = "//a[href='/web#menu_id=94&action=']")
  //  public WebElement LunchModule;

   // @FindBy(xpath = "//a[href='/web#menu_id=165&action=']")
   // public WebElement MaintenanceModule;

    //@FindBy(xpath = "//a[href='/web#menu_id=1&action=']")
    //public WebElement DashboardModule;



}
