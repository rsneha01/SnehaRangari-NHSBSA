package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateOfBirthPage extends Page {

    private By dayLocator = By.id("dob-day");
    private By monthLocator = By.id("dob-month");
    private By yearLocator = By.id("dob-year");
    private By nextButtonLocator = By.id("next-button");
    private By dateOfBirthErrorLocator = By.linkText("Enter your date of birth");

    private By checkTheYearLocator = By.linkText("Check the year you were born is correct");

    public DateOfBirthPage(WebDriver driver) { super(driver); }
    public void clickNextButton() {clickEvent(nextButtonLocator);}

    public void enterDateOfBirthAndClickNext(String day, String month, String year) {
        sendTextValues(dayLocator, day);
        sendTextValues(monthLocator, month);
        sendTextValues(yearLocator, year);
        clickNextButton();
    }

    public String getDateOfBirthErrorMessage() { return getElementText(dateOfBirthErrorLocator); }

    public String getCheckTheYearErrorMessage() { return getElementText(checkTheYearLocator); }

}
