package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveStreamPage extends BasePage{


    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageBtn;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskBtn;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventBtn;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreBtn;





}
