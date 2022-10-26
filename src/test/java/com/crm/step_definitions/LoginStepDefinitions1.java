package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions1 {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User enters valid username {string}")
    public void user_enters_valid_username(String username) {
        loginPage.usernameBox.sendKeys(username);
    }
    @When("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("user access the home page")
    public void user_access_the_home_page() {
       basePage.ActiveStreamBtn.isDisplayed();
    }

    //----ac2--> "Incorrect login or password." should be displayed for invalid data


    @When("user enters any username {string}")
    public void user_enters_any_username(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @When("user enters any password {string}")
    public void user_enters_any_password(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @Then("user should see warning message(invalid)")
    public void user_should_see_warning_message() {
        loginPage.alertText.isDisplayed();
    }


    // -----AC 3  "Please fill out this field" message should be displayed if the password or username is empty



    @Then("user should see warning message \\(fill out)")
    public void userShouldSeeWarningMessageFillOut() {
        Assert.assertEquals(loginPage.alertText,"Please fill out this field");
    }
}
