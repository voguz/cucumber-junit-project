package com.cydeo.step_definitions;

import com.cydeo.pages.webTablePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class webTable_StepDef {

    webTablePage webtablepage = new webTablePage();

    @Given("user is on the login page of that table app")
    public void user_is_on_the_login_page_of_that_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webtablepage.inputUsername.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {

        webtablepage.inputPassword.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webtablepage.loginButton.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }


    @When("user enters username{string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
//        webtablepage.inputUsername.sendKeys(username);
//        webtablepage.inputPassword.sendKeys(password);
//        webtablepage.loginButton.click();

        webtablepage.login(username,password);
    }

    //webTable

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
//        webtablepage.inputUsername.sendKeys(credentials.get("username"));
//        webtablepage.inputPassword.sendKeys(credentials.get("password"));
//        webtablepage.loginButton.click();

        webtablepage.login(credentials.get("username"), credentials.get("password"));

    }
}
