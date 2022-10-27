package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {

    HomePage homePage = new HomePage();
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
        homePage.ActiveStreamBtn.isDisplayed();
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


    @Then("user should see warning message invalid")
    public void userShouldSeeWarningMessageInvalid() {
        loginPage.alertText.isDisplayed();
    }


    // -----AC 3  "Please fill out this field" message should be displayed if the password or username is empty


    @Then("user should see warning message-fill out")
    public void userShouldSeeWarningMessageFillOut() {
        Assert.assertEquals(loginPage.alertText, "Please fill out this field");
    }


    //------AC--> 4-User land on the ‘Get Password’ page after clicking on the "Forgot your password?" link

    @When("User click Forgot your password link")
    public void userClickForgotYourPasswordLink() {
        loginPage.forgotPasswordLink.click();
    }

    @Then("User land  on the Get Password page")
    public void userLandOnTheGetPasswordPage() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Get Password");
    }


    //------AC5 -->User can see "Remember Me" link exists and is clickable on the login page

    @Then("Remember Me link is clickable")
    public void rememberMeLinkIsClickable() {
        loginPage.rememberMe.click();
        loginPage.rememberMe.isSelected();
    }

    //----AC6-->User should see the password in bullet signs by default

    @Then("User should see the password in bullet signs by default")
    public void userShouldSeeThePasswordInBulletSignsByDefault() {
        Assert.assertEquals("password", loginPage.passwordBox.getAttribute("type"));
    }


    @And("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("hrUser"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));


    }

    @And("user press ENTER")
    public void userPressENTER() {
        loginPage.passwordBox.sendKeys(Keys.ENTER);



    }

    @Then("user see their {string}")
    public void userSeeTheir(String arg0) {
        Assert.assertEquals(homePage.username.getText(),arg0);

    }



}
