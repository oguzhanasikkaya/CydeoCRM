package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement message;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement insertVideBtn ;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement quoteBtn;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagBtn;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionBtn ;

    @FindBy(xpath = "(//span[.='Record Video'])[1]")
    public WebElement recordBtn;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination feed-add-post-destination-all-users']//span)[2]")
    public WebElement allEmployeesCross;

    @FindBy(id = "feed-add-post-destination-item")
    public WebElement allEmployees;

    @FindBy(id = "bx-destination-tag")
    public WebElement addPersonGroupsDepartmentBtn;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement addEmployeesAndDepartments;

    @FindBy(xpath = "//div[.='group2.2']")
    public WebElement group2_2;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-check-arrow'])[4]")
    public WebElement group2_2AllDepartmentRadioBox;

    @FindBy(xpath = "//body[@class='vsc-initialized']")
    public WebElement messageBody;

    @FindBy(xpath = "(//div[.='helpdesk1@cybertekschool.com'])[3]")
    public WebElement helpdesk1;






}
