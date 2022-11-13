package com.cydeo.step_definitions;

import com.cydeo.pages.Practice1Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practice1_ETSY_StepDef {
    Practice1Page practice1Page = new Practice1Page();
    Actions actions = new Actions(Driver.getDriver());




    @Given("user should be on the main page ETSY")
    public void user_should_be_on_the_main_page_etsy() {
        Driver.getDriver().get("https://www.etsy.com/");


    }
    @When("user clicks to search button")
    public void user_clicks_to_search_button() {
        practice1Page.SearchButton.click();


    }
    @When("user search the {string}")
    public void user_search_the(String string) {

        practice1Page.SearchButton.sendKeys(string);


    }
    @Then("user sees the products")
    public void user_sees_the_products() throws InterruptedException {
        WebElement SubscribeButton = Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']"));
        actions.moveToElement(SubscribeButton).perform();
        Thread.sleep(2000);



    }
}
