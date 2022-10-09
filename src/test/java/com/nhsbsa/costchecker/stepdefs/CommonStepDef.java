package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.CommonPage;
import com.nhsbsa.costchecker.pageobjects.CostsCheckerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CommonStepDef {

    private WebDriver driver;
    private CommonPage commonPage;
    private CostsCheckerPage costsCheckerPage;

    public CommonStepDef() {
        driver = Config.getDriver();
        commonPage = new CommonPage(driver);
        costsCheckerPage = new CostsCheckerPage(driver);
    }

    @When("^I select the (.*)$")
    public void iSelectTheHyperlink(String hyperlink) throws InterruptedException {
        switch (hyperlink) {
          case "Back link":
                commonPage.backLink();
                break;
            case "Read More About Cookies link":
                commonPage.readMoreCookiesLink();
                break;
            case "Accept Analytics Cookies button":
                commonPage.acceptAnalyticsCookiesButton();
                break;
            case "Reject Analytics Cookies button":
                commonPage.rejectAnalyticsCookiesButton();
                break;
            case "Cookies Page link":
                commonPage.cookiesPageLink();
                break;
            case "Beta Banner Feedback link":
                commonPage.betaBannerFeedbackLink();
                break;
            case "Privacy Policy Footer link":
                commonPage.privacyPolicyFooterLink();
                break;
            case "Cookies Footer link":
                commonPage.cookiesFooterLink();
                break;
            case "Terms and Conditions Footer link":
                commonPage.termsConditionsFooterLink();
                break;
            case "Accessibility Footer link":
                commonPage.accessibilityFooterLink();
                break;
            case "NHSBSA Footer link":
                commonPage.nhsBSAFooterLink();
                break;
            case "Open Government Licence link":
                commonPage.openGovernmentLicenceLink();
                break;

        }
    }
    @When("^I see that the cookies banner is displayed$")
    public void iSeeThatTheCookiesBannerIsDisplayed() {
        Assert.assertTrue(commonPage.cookieBannerDisplayed());
    }
    @Then("^I will see the Cookie Banner message$")
    public void iWillSeeTheCookieBannerMessage() { commonPage.getCookieBannerMessage(); }

    @When("^I click the (.*)$")
    public void iClickTheButton(String button) {

        switch (button) {
            case "Start Now button":
                commonPage.startNowButton();
                break;
            case "Next button":
                commonPage.nextButton();
                break;

        }
    }

}

