package com.nhsbsa.costchecker.runners;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.Page;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.nhsbsa.costchecker.stepdefs"},
        features = {"src/test/resources/features/"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" , "html:target/cucumber-reports/NHSBSA Costs Checker Test Automation Report.html"},
        tags = "@AcceptanceTests"
)

public class GenericTestRunner {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        driver = Config.setDriver();
    }

    @AfterClass
    public static void teardown() {
        Page page = new Page(driver);
        page.tearDownDriver();
    }
}
