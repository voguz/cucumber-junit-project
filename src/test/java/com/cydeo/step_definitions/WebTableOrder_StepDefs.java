package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.pages.webTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefs {

    webTablePage webTablePage = new webTablePage();
    BasePage basePage = new BasePage();
    WebTableOrderPage webtableorderpage = new WebTableOrderPage();
    Select select;

    ViewAllOrdersPage viewallorderspage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTablePage.login(ConfigurationReader.getProperty("user"),ConfigurationReader.getProperty("password"));
        basePage.orderButtonNavItem.click();


    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        select = new Select(webtableorderpage.productTypeDropdown);
        select.selectByVisibleText(string);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        webtableorderpage.inputQuantity.clear();
        webtableorderpage.inputQuantity.sendKeys(int1+""); //cunku biz kac girilecegini bilmiyoruz otomatik featuredan almasi gerek


    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        webtableorderpage.inputName.sendKeys(string);

    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        webtableorderpage.inputStreet.sendKeys(string);

    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        webtableorderpage.inputCity.sendKeys(string);

    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webtableorderpage.inputState.sendKeys(string);

    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webtableorderpage.inputZip.sendKeys(string);

    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//        for (WebElement each : webtableorderpage.cardType) {
//            if (each.getAttribute("value").equalsIgnoreCase(string)){
//                each.click();
//            }
//        }
        BrowserUtils.clickRadioButton(webtableorderpage.cardType,string);

    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webtableorderpage.inputCardNo.sendKeys(string);

    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webtableorderpage.inputCardExp.sendKeys(string);

    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webtableorderpage.processOrderButton.click();


    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {
        String actualCustomerName = viewallorderspage.newCustomerCell.getText();
        Assert.assertEquals(expectedCustomerName,actualCustomerName);

    }




}
