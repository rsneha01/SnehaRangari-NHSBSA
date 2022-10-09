package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SetupStepDef {

    private Scenario scenario;
    private WebDriver driver;

    public SetupStepDef() {
        driver = Config.getDriver();
    }

    @Before
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void checkScenarioRunStatus(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", "step failed");
        }
    }
}
