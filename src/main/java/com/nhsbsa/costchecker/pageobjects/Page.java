package com.nhsbsa.costchecker.pageobjects;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Page {

    protected WebDriver driver;
    private WebElement element;
    public int explicitWaitTime = 50;
    public WebDriverWait wait;

    public Page(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public WebDriverWait getWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWaitTime));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(ElementNotInteractableException.class);
        return wait;
    }

   public void clickEvent(By by) {
        wait = getWait();
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.click();
    }

    public void sendTextValues(By by, String text) {
        wait = getWait();
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.clear();
        element.sendKeys(text);
    }

    public void checkScenarioRunStatus(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/jpeg", "failed screen");
        }
    }

    public String getElementText(By by) {
        return driver.findElement(by).getText();
    }

    public boolean getElementIsDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public String getPageTitles() {
        return driver.getTitle();
    }

    public void click() {
        element.click();
    }
    public void tearDownDriver() {
        driver.quit();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }


}
