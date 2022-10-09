package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class CommonPage extends Page {
    private By startNowButtonLocator = By.id("next-button");
    private By backLinkLocator = By.id("back-button");
    private By nextButtonLocator = By.id("next-button");
    private By cookiesBannerLocator = By.id("cookiebanner");
    private By readMoreCookiesLinkLocator = By.id("nhsuk-cookie-banner__link");
    private By acceptAnalyticsCookiesLocator = By.id("nhsuk-cookie-banner__link_accept_analytics");
    private By rejectAnalyticsCookiesLocator = By.id("nhsuk-cookie-banner__link_accept");
    private By cookiesBannerMessageLocator = By.id("nhsuk-success-banner__message");
    private By cookiesPage = By.linkText("cookies page");
    private By betaBannerFeedbackLocator = By.id("feedback-link");
    private By privacyPolicyLocator = By.id("privacy-footer-link");
    private By cookiesFooterLocator = By.id("cookies-footer-link");
    private By termsFooterLocator = By.id("terms-footer-link");
    private By accessibilityFooterLocator = By.id("footer-link-accessibility");
    private By nhsBSAFooterLocator = By.id("bsa-footer-link");
    private By openLicenceLocator = By.xpath("//*[@id=\"footer\"]/div/div/div/div/p[2]/a");

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    public void backLink() {
        clickEvent(backLinkLocator);
    }

    public void startNowButton() {
        clickEvent(startNowButtonLocator);
    }

    public void nextButton() {
        clickEvent(nextButtonLocator);
    }

    public void readMoreCookiesLink() {
        clickEvent(readMoreCookiesLinkLocator);
    }

    public boolean cookieBannerDisplayed() {
        return getElementIsDisplayed(cookiesBannerLocator);
    }

    public void acceptAnalyticsCookiesButton() {
        clickEvent(acceptAnalyticsCookiesLocator);
    }

    public void rejectAnalyticsCookiesButton() {
        clickEvent(rejectAnalyticsCookiesLocator);
    }

    public void cookiesPageLink() {
        clickEvent(cookiesPage);
    }

    public void betaBannerFeedbackLink() {
        clickEvent(betaBannerFeedbackLocator);
    }

    public void privacyPolicyFooterLink() {
        clickEvent(privacyPolicyLocator);
    }

    public void cookiesFooterLink() {
        clickEvent(cookiesFooterLocator);
    }

    public void termsConditionsFooterLink() {
        clickEvent(termsFooterLocator);
    }

    public void accessibilityFooterLink() {
        clickEvent(accessibilityFooterLocator);
    }

    public void nhsBSAFooterLink() {
        clickEvent(nhsBSAFooterLocator);
    }

    public void openGovernmentLicenceLink() {
        clickEvent(openLicenceLocator);
    }


    public String getFooterLinksPageURL() {
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        return getUrl();
    }

    public String getFooterLinksPageTitle() {
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String getFooterLinksPageTitle = getPageTitles();
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
        return getFooterLinksPageTitle;
    }

    public String getCurrentPageTitle() {
        return (driver.getTitle());
    }

    public String getCurrentURL() {
        return (driver.getCurrentUrl());
    }

    public String getCookieBannerMessage() {
        return getElementText(cookiesBannerMessageLocator);
    }

    public String getSnapSurveyPageUrl() {
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        return getUrl();
    }

    public String getSnapSurveyPageTitle() {
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        return getPageTitles();
    }
}
