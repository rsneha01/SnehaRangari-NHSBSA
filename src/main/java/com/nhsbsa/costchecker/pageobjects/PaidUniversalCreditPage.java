package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaidUniversalCreditPage extends Page {

    private By yesUniversalRadioButtonLocator = By.id("yes-universal");
    private By notYetUniversalRadioButtonLocator = By.id("not-yet");
    private By noUniversalRadioButtonLocator = By.id("different-benefit");
    private By nextButtonLocator = By.id("next-button");
    private By getPaidUniversalCreditErrorLocator = By.linkText("Select 'yes' if you or your partner get paid Universal Credit");


    public PaidUniversalCreditPage(WebDriver driver) {
        super(driver);
    }

    public void clickNextButton() {
        clickEvent(nextButtonLocator);
    }

    public void selectYesUniversalRadioButtonAndClickNext() {
        clickEvent(yesUniversalRadioButtonLocator);
        clickNextButton();
    }

    public void selectNotYetUniversalRadioButtonAndClickNext() {
        clickEvent(notYetUniversalRadioButtonLocator);
        clickNextButton();
    }

    public void selectNoUniversalRadioButtonAndClickNext() {
        clickEvent(noUniversalRadioButtonLocator);
        clickNextButton();
    }

    public String getPaidUniversalCreditErrorMessage() {
        return getElementText(getPaidUniversalCreditErrorLocator);
    }


}
