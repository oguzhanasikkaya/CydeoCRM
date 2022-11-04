package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.MessagePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageStepDefinitions {
    HomePage homePage = new HomePage();
    MessagePage messagePage = new MessagePage();



    @Given("user click Activity Stream module")
    public void user_click_module() {
        homePage.activeStreamBtn.click();

    }
    @Given("User click Message button")
    public void user_click_button() {
        messagePage.message.click();

    }
    @When("user remove All employees that writing by default")
    public void user_remove_all_employees_that_writing_by_default() {
        messagePage.allEmployeesCross.click();

    }
    @When("user click the mention button")
    public void user_click_the_button() {
        messagePage.mentionBtn.click();

    }
    @When("user click the Employees and department button")
    public void user_click_the_employees_and_department_button() {
        BrowserUtils.sleep(3);
        messagePage.addEmployeesAndDepartments.click();

    }
    @When("user click group2.2")
    public void user_click() {
        messagePage.group2_2.click();
    }


    @And("user select any user")
    public void userSelectAnyUser() {
        BrowserUtils.sleep(2);
        messagePage.helpdesk1.click();


    }

    @Then("user should see selected user in the message body")
    public void userShouldSeeSelectedUserInTheMessageBody() {
        messagePage.helpdesk1InBody.isDisplayed();
    }

    @When("user click link button")
    public void userClickLinkButton() {
        messagePage.linkBtn.click();
    }

    @And("user write text name")
    public void userWriteTextName() {
        messagePage.linkTextBox.sendKeys("this text in order for test");
    }

    @And("user write text link")
    public void userWriteTextLink() {
        messagePage.linkUrlBox.sendKeys("https://docs.google.com/document/d/1WngspGGhOBrJDjmbXVQsIQVs386ca2121IbEqJmq1bw/edit");
    }

    @And("user click save button")
    public void userClickSaveButton() {
        BrowserUtils.sleep(2);
        messagePage.saveLinkBtn.click();
        System.out.println("save btn click");
    }

    @Then("message body contain link text")
    public void messageBodyContainLinkText() {
        Driver.getDriver().switchTo().frame(messagePage.messageBodyIframe);
        System.out.println("messagePage.linkTextInBody.getText() = " + messagePage.linkTextInBody.getText());
        Driver.getDriver().switchTo().defaultContent();


    }
}
