package com.crm.pages;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage( ){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "user-name")
    public WebElement userName;

    //-------------------------modules-----------------------------------------------------

    @FindBy(id = "bx_left_menu_menu_live_feed")
    public WebElement activeStreamBtn;

    @FindBy(id = "bx_left_menu_menu_tasks")
    public WebElement tasksBtn;

    @FindBy(id = "bx_left_menu_menu_im_messenger")
    public WebElement chatAndCallsBtn;

    @FindBy(id = "bx_left_menu_menu_all_groups")
    public WebElement workgroupsBtn;

    @FindBy(id = "bx_left_menu_menu_files")
    public WebElement driveBtn;

    @FindBy(id = "bx_left_menu_menu_calendar")
    public WebElement calendarBtn;

    @FindBy(id = "bx_left_menu_menu_external_mail")
    public WebElement mailBtn;

    @FindBy(id = "bx_left_menu_menu_contact_center")
    public WebElement contactCenterBtn;

    @FindBy(id = "bx_left_menu_menu_timeman_sect")
    public WebElement timeAndReportsBtn;

    @FindBy(id = "bx_left_menu_menu_company")
    public WebElement employeesBtn;

    @FindBy(id = "bx_left_menu_menu_service_sect")
    public WebElement serviceBtn;

    @FindBy(id = "bx_left_menu_menu_about_sect")
    public WebElement companyBtn;

    @FindBy(id = "left-menu-more-btn")
    public WebElement moreBtn;

    @FindBy(id = "left-menu-settings")
    public WebElement configureMenuBtn;

    //-------------------Activity- Stream-------sub-modules----------------------------------------------------

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement AcMessage;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement AcTask;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement AcEvent;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement AcPoll;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement AcMore;

    //-------------------useful methods------------------------------------------------------------------------------------



    //navigate to any given module and subModule
    public void  navigateToModule(String moduleName ){

        WebElement module = Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='"+moduleName+"']"));
        module.click();


    }

    //get username methods
    public String getUserName(){
        BrowserUtils.waitForVisibilityOf(userName);
        return userName.getText();
    }

    public void logOut(){

    }



}
