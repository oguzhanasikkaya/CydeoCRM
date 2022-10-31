package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LogoutStepDefinitions{


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    Actions actions = new Actions(Driver.getDriver());



    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        loginPage.login();

    }

    @When("user click the user menu")
    public void userClickTheUserMenu() {
        BrowserUtils.navigateToModule(ConfigurationReader.getProperty("hrUser"));
    }

    @And("user click the logout button")
    public void userClickTheLogoutButton() {
        homePage.logoutBtn.click();
    }

    @Then("user ends up on login page")
    public void userEndsUpOnLoginPage() {
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());
    }

    @And("user click the step back button")
    public void userClickTheStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user can not go to home page")
    public void userCanNotGoToHomePage() {
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());
    }

    @When("user open new tab with home page url")
    public void userOpenNewTabWithHomePageUrl() {
        /*Action builder =actions.moveToElement(homePage.activeStreamBtn)
                .contextClick(homePage.activeStreamBtn).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER).build();
        builder.perform();*/

        actions.moveToElement(homePage.activeStreamBtn)
               .keyDown(Keys.LEFT_CONTROL).click()
               .release().perform();
    }

    @And("user close the open tab\\(s)")
    public void userCloseTheOpenTabS() {
        Driver.getDriver().quit();
    }

    @And("user open home page url")
    public void userOpenHomePageUrl() {
        Driver.getDriver().get("https://qa.azulcrm.com/stream/");
    }


}
