package com.crm.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("<user> is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("hello");
    }
    @And("<user> enter valid <username>")
    public void user_enter_valid_username() {

    }
    @And("<user> enter valid <password>")
    public void user_enter_valid_password() {

    }
    @And("<user> click sing in button")
    public void user_click_sing_in_button() {

    }
    @Then("<user> see his\\/her name on the dashboard")
    public void user_see_his_her_name_on_the_dashboard() {

    }



}
