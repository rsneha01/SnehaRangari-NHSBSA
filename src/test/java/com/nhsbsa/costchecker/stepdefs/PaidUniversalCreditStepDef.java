package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.nhsbsa.costchecker.pageobjects.PaidUniversalCreditPage;

public class PaidUniversalCreditStepDef {
    private PaidUniversalCreditPage paidUniversalCreditPage;
    private WebDriver driver;
    public PaidUniversalCreditStepDef() {
        driver = Config.getDriver();
        paidUniversalCreditPage = new PaidUniversalCreditPage(driver);
    }

    @When("^I (.*) get paid universal credit$")
    public void iOptionGetPaidUniversalCredit(String option) {
        switch (option) {
            case "do":
                paidUniversalCreditPage.selectYesUniversalRadioButtonAndClickNext();
                break;
            case "have applied to":
                paidUniversalCreditPage.selectNotYetUniversalRadioButtonAndClickNext();
                break;
            case "do not":
                paidUniversalCreditPage.selectNoUniversalRadioButtonAndClickNext();
                break;
        }
    }

}
