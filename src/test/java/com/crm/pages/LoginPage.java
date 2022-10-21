package com.crm.pages;

import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(className = "errorText")
    public WebElement alertText;



}
