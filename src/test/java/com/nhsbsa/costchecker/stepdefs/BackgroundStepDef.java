package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import static com.nhsbsa.costchecker.stepdefs.Constants.*;


public class BackgroundStepDef {

    private WebDriver driver;
    private String Url;
    private CommonPage commonPage;
    private Page page;
    private CostsCheckerPage costsCheckerPage;
    private DateOfBirthPage dateOfBirthPage;

    private PaidUniversalCreditPage paidUniversalCreditPage;

    public BackgroundStepDef() {
        driver = Config.getDriver();
        Url = Config.getURL();
        commonPage = new CommonPage(driver);
        page = new Page(driver);
        costsCheckerPage = new CostsCheckerPage(driver);
        dateOfBirthPage = new DateOfBirthPage(driver);
        paidUniversalCreditPage = new PaidUniversalCreditPage(driver);

    }

    @Given("^I launch the NHS Costs Check application$")
    public void iLaunchTheNHSCostsCheckApplication() {
        driver.manage().deleteAllCookies();
        new Page(driver).navigateToUrl(Url);
    }
    @And("^I start my NHSBSA Cost Check$")
    public void iStartMyNHSBSACostCheck() {
        costsCheckerPage.startNowButton();
    }

    @And("^I start my NHSBSA Cost Check and select country (.*)$")
    public void iStartMyNHSBSACostCheckAndSelectCountryOption(String option) {
        iStartMyNHSBSACostCheck();
        switch (option) {
            case "England":
                costsCheckerPage.selectCountryEngland();
                costsCheckerPage.nextButton();
                break;
            case "Scotland":
                costsCheckerPage.selectCountryScotland();
                costsCheckerPage.nextButton();
                break;
            case "Wales":
                costsCheckerPage.selectCountryWales();
                costsCheckerPage.nextButton();
                break;
            case"Northern Ireland":
                costsCheckerPage.selectCountryNorthernIreland();
                costsCheckerPage.nextButton();
                break;
        }

    }
    @And("^I have selected my option on Dental Practice page$")
    public void iHaveSelectedMyOptionOnDentalPracticePage() {
        costsCheckerPage.startNowButton();
        costsCheckerPage.selectCountryEngland();
        costsCheckerPage.nextButton();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
        costsCheckerPage.selectCountryEngland();
        costsCheckerPage.nextButton();
    }

    @And("^I enter my details until Date of Birth page$")
    public void iEnterMyDetailsUntilDateOfBirthPage() {
        iHaveSelectedMyOptionOnDentalPracticePage();
        dateOfBirthPage.enterDateOfBirthAndClickNext(DOB_DAY,DOB_MONTH,DOB_YEAR);
    }

    @And("^I enter my details until Live with Partner page$")
    public void iEnterMyDetailsUntilLiveWithPartnerPage() {
        iEnterMyDetailsUntilDateOfBirthPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Claim Benefits page$")
    public void iEnterMyDetailsUntilClaimBenefitsPage() {
        iEnterMyDetailsUntilLiveWithPartnerPage();
        costsCheckerPage.selectNoRadioButtonAndClickNext();
    }

    @And("^I enter my details until Partner Claim Benefits page$")
    public void iEnterMyDetailsUntilPartnerClaimBenefitsPage() {
        iEnterMyDetailsUntilLiveWithPartnerPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }
    @And("^I enter my details until Universal Credit Claim page$")
    public void iEnterMyDetailsUntilUniversalCreditClaimPage() {
        iEnterMyDetailsUntilPartnerClaimBenefitsPage();
        paidUniversalCreditPage.selectYesUniversalRadioButtonAndClickNext();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }
    @And("^I enter my details until Pregnant or Given Birth page$")
    public void iEnterMyDetailsUntilPregnantOrGivenBirthPage() {
        iEnterMyDetailsUntilClaimBenefitsPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Injury Or Illness page$")
    public void iEnterMyDetailsUntilInjuryOrIllnessPage() {
        iEnterMyDetailsUntilPregnantOrGivenBirthPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Diabetes page$")
    public void iEnterMyDetailsUntilDiabetesPage() {
        iEnterMyDetailsUntilInjuryOrIllnessPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Diabetes Medication page$")
    public void iEnterMyDetailsUntilDiabetesMedicationPage() {
        iEnterMyDetailsUntilDiabetesPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Care Home page$")
    public void iEnterMyDetailsUntilCareHomePage() {
        iEnterMyDetailsUntilDiabetesMedicationPage();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

    @And("^I enter my details until Local Council page$")
    public void iEnterMyDetailsUntilLocalCouncilPage() {
        iEnterMyDetailsUntilCareHomePage();
        costsCheckerPage.selectNoRadioButtonAndClickNext();
    }

    @And("^I enter my details until List of Medical Conditions page$")
    public void iEnterMyDetailsUntilListOfMedicalConditionsPage() {
        iEnterMyDetailsUntilInjuryOrIllnessPage();
        costsCheckerPage.selectNoRadioButtonAndClickNext();
        costsCheckerPage.selectYesRadioButtonAndClickNext();
    }

}
