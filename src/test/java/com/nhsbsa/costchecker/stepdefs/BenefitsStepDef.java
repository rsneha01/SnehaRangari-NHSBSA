package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.BenefitsPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class BenefitsStepDef {

    private BenefitsPage benefitsPage;
    private WebDriver driver;

    public BenefitsStepDef() {
        driver = Config.getDriver();
        benefitsPage = new BenefitsPage(driver);
    }

    @When("^I select (.*) checkbox$")
    public void iSelectCheckBoxCheckbox(String checkbox) {
        switch (checkbox){
            case "Tax Credits":
                benefitsPage.selectTaxCreditCheckBox();
                benefitsPage.clickNextButton();
                break;
            case "Income Support":
                benefitsPage.selectIncomeSupportCheckBox();
                benefitsPage.clickNextButton();
                break;
            case "Employment and Support Allowance (ESA)":
                benefitsPage.selectEmploymentSACheckBox();
                benefitsPage.clickNextButton();
                break;
            case "Jobseeker's Allowance (JSA)":
                benefitsPage.selectJobSACheckBox();
                benefitsPage.clickNextButton();
                break;
            case "Pension Credit":
                benefitsPage.selectPensionCreditCheckBox();
                benefitsPage.clickNextButton();
                break;
            case "No, we don't get any of these":
                benefitsPage.selectNoCheckBoxAndClickNext();
                benefitsPage.clickNextButton();
                break;
            case "All":
                benefitsPage.selectTaxCreditCheckBox();
                benefitsPage.selectIncomeSupportCheckBox();
                benefitsPage.selectEmploymentSACheckBox();
                benefitsPage.selectJobSACheckBox();
                benefitsPage.selectPensionCreditCheckBox();
                benefitsPage.clickNextButton();
                break;
        }
    }
}
