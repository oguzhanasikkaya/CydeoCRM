package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage( ){
        PageFactory.initElements(Driver.getDriver(),this);

    }






    //navigate to any given module and subModule
    public void  navigateToModule(String moduleName ){

        WebElement module = Driver.getDriver().findElement(By.xpath("//span[normalize-space(text())='"+moduleName+"']"));
        module.click();


    }



}
