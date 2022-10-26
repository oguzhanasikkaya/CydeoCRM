package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the crm login page")
    public void user_is_on_the_crm_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.usernameBox.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginBtn.click();
    }


    @When("user enter username {string}")
    public void user_enter_username(String string) {
        loginPage.usernameBox.sendKeys(string);

    }
    @When("user enters {string}")
    public void user_enters(String string) {
        loginPage.passwordBox.sendKeys(string);

    }

    @Then("user should see the hr {string}")
    public void user_should_see_the_hr(String string) {

    }

    @Then("user should see the marketing {string}")
    public void user_should_see_the_marketing(String string) {

    }


    @Then("user should see the helpdesk {string}")
    public void user_should_see_the_helpdesk(String string) {

    }












}
