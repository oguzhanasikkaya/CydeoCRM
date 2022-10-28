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

public class LogoutStepDefinitions{


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();



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
}
