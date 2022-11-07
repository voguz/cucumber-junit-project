package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //  @Before
    public void setUpScenario() {
        System.out.println("Setting up browser using cucumber @Before for each scenario");
        Driver.getDriver().get("URL of your app");
    }

    @After
    public void TearDownScenario(Scenario scenario) {
        //System.out.println("it will be closing browser using cucumber @After for each scenario");

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

            Driver.closeDriver();

        }

    }
