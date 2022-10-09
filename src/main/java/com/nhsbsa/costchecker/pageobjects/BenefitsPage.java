package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BenefitsPage extends Page {

    private By taxCreditCheckBoxLocator = By.id("taxCredit");
    private By incomeSupportCheckBoxLocator = By.id("incSupport");
    private By employmentSACheckBoxLocator = By.id("esa");
    private By jobSACheckBoxLocator = By.id("jsa");
    private By pensionCreditCheckBoxLocator = By.id("penCredit");
    private By noCheckBoxLocator = By.id("continue");
    private By benefitsErrorLocator = By.partialLinkText("Select which benefit you or your partner get or select 'no'");

    private By nextButtonLocator = By.id("next-button");

    public BenefitsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNextButton() {
        clickEvent(nextButtonLocator);
    }

    public void selectTaxCreditCheckBox() {
        clickEvent(taxCreditCheckBoxLocator);
    }

    public void selectIncomeSupportCheckBox() {
        clickEvent(incomeSupportCheckBoxLocator);
    }

    public void selectEmploymentSACheckBox() {
        clickEvent(employmentSACheckBoxLocator);
    }

    public void selectJobSACheckBox() {
        clickEvent(jobSACheckBoxLocator);
    }

    public void selectPensionCreditCheckBox() {
        clickEvent(pensionCreditCheckBoxLocator);
    }

    public void selectNoCheckBoxAndClickNext() {
        clickEvent(noCheckBoxLocator);
        clickNextButton();
    }

    public String getBenefitsErrorMessage() {
        return getElementText(benefitsErrorLocator);
    }

}
