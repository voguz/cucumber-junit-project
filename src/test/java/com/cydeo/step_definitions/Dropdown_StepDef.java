package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown_StepDef {
    DropDownPage dropDownPage = new DropDownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

//        Select selectMonth = new Select(dropDownPage.monthDropDown);
//
//        List<WebElement> actualOptionsWebElement = selectMonth.getOptions();
//
//        List<String> actualOptionsAsString = new ArrayList<> ();
//
//        for (WebElement each : actualOptionsWebElement) {
//            actualOptionsAsString.add(each.getText());
//        }

        //Bu Line BrowserUtils den geliyor hard coding yapmak istersen bu line kaldir ve ustteki /lari kaldir
        List<String> actualOptionsAsString= BrowserUtils.dropdownOptionsAsString(dropDownPage.monthDropDown) ;
        Assert.assertEquals(expectedMonths,actualOptionsAsString);

    }


}
