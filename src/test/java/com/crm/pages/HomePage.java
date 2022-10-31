package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this  );
    }

    //-----------------modules----------------


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

   //------------module element has finished ----





    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileBtn;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfileSettingBtn;

    @FindBy(xpath = "//span[.='Themes']")
    public WebElement themesBtn;

    @FindBy(xpath = "//span[.='Configure notifications']")
    public WebElement configureNotificationBtn;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutBtn;

}
