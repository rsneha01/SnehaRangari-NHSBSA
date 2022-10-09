package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavingsPage extends Page {

    public SavingsPage(WebDriver driver) {
        super(driver);
    }

    private By yesRadioButtonLocator = By.id("radio-yes");
    private By noRadioButtonLocator = By.id("radio-no");
    private By nextButtonLocator = By.id("next-button");

    private By savingsErrorLocator = By.linkText("Select 'yes' if you or your partner have savings, investments and property over this amount");

    public void nextButton() {
        clickEvent(nextButtonLocator);
    }

    public void selectYesRadioButtonAndClickNext() {
        clickEvent(yesRadioButtonLocator);
        nextButton();
    }

    public void selectNoRadioButtonAndClickNext() {
        clickEvent(noRadioButtonLocator);
        nextButton();
    }

    public String getSavingsErrorMessage() {
        return getElementText(savingsErrorLocator);
    }


}
