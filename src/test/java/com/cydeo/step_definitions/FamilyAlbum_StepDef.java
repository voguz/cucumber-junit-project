package com.cydeo.step_definitions;

import com.cydeo.pages.FamilyAlbumPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class FamilyAlbum_StepDef {

    FamilyAlbumPage familyAlbumPage = new FamilyAlbumPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        familyAlbumPage.userName.sendKeys("Tester");
        familyAlbumPage.passWord.sendKeys("test");
        familyAlbumPage.LoginButton.click();
        familyAlbumPage.order.click();
        familyAlbumPage.dropDown.click();

    }
    @When("User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        familyAlbumPage.familyAlbum.click();

    }
    @When("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {
        familyAlbumPage.Quantity.sendKeys("4");

    }
    @When("User enters John Wick to costumer name")
    public void user_enters_john_wick_to_costumer_name() {
        familyAlbumPage.nameInfo.sendKeys("John Wick");

    }
    @When("User enters Kinzie Ave to street")
    public void user_enters_kinzie_ave_to_street() {

    }
    @When("User enters Chicago to city")
    public void user_enters_chicago_to_city() {

    }
    @When("User enters IL to state")
    public void user_enters_il_to_state() {

    }
    @When("User enters {int}")
    public void user_enters(Integer int1) {

    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {

    }
    @When("User enters {int} to card number")
    public void user_enters_to_card_number(Integer int1) {

    }
    @When("User enters {int}\\/{int} to expiration date")
    public void user_enters_to_expiration_date(Integer int1, Integer int2) {

    }
    @When("User clicks process button")
    public void user_clicks_process_button() {

    }
    @Then("User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

    }


}
