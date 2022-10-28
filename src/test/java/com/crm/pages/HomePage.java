package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this  );
    }

    @FindBy(id = "menu-counter-live-feed")
    public WebElement ActiveStreamBtn;

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
