package com.crm.step_definitions;

import com.crm.pages.ActiveStreamPage;
import com.crm.pages.BasePage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import org.junit.Test;

public class Tests extends BasePage {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ActiveStreamPage activeStreamPage = new ActiveStreamPage();



    @Test
    public void test_1_navigate() {
        loginPage.login();
        navigateToModule("Drive");
    }

    @Test //test passed
    public  void  test_2_active_stream(){
        loginPage.login();
        navigateToModule("Activity Stream");
        activeStreamPage.messageBtn.click();
        BrowserUtils.sleep(2);
        activeStreamPage.taskBtn.click();
        BrowserUtils.sleep(2);
        activeStreamPage.eventBtn.click();
        BrowserUtils.sleep(2);
        activeStreamPage.pollBtn.click();
        BrowserUtils.sleep(2);
        activeStreamPage.moreBtn.click();
        BrowserUtils.sleep(2);
    }

    @Test
    public  void test_3_profileDropdown(){
        loginPage.login();
        navigateToModule(ConfigurationReader.getProperty("hrUser"));
        BrowserUtils.sleep(3);
    }



}
