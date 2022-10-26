package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this  );
    }

    @FindBy(id = "menu-counter-live-feed")
    public WebElement ActiveStreamBtn;

    @FindBy(id = "user-name")
    public WebElement username;



}
