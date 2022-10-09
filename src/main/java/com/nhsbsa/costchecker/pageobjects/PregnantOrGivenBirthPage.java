package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PregnantOrGivenBirthPage extends Page {

    public PregnantOrGivenBirthPage(WebDriver driver) {
        super(driver);

    }

    private By nextButtonLocator = By.id("next-button");
    private By yesRadioButtonLocator = By.id("radio-yes");
    private By noRadioButtonLocator = By.id("radio-no");
    private By pregnantOrGivenBirthErrorLocator = By.linkText("Select 'yes' if you are pregnant or have given birth in the last 12 months");

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

    public String getPregnantOrGivenBirthErrorMessage() {
        return getElementText(pregnantOrGivenBirthErrorLocator);
    }

}
