package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.*;
import com.nhsbsa.costchecker.pageobjects.Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.nhsbsa.costchecker.stepdefs.Constants.*;

public class OutputStepDef {

    private WebDriver driver;
    private CommonPage commonPage;
    private Page page;
    private CostsCheckerPage costsCheckerPage;
    private BenefitsPage benefitsPage;
    private PaidUniversalCreditPage paidUniversalCreditPage;
    private DateOfBirthPage dateOfBirthPage;
    private SavingsPage savingsPage;
    private PregnantOrGivenBirthPage pregnantOrGivenBirthPage;

    public OutputStepDef() throws IOException {
        driver = Config.getDriver();
        commonPage = new CommonPage(driver);
        page = new Page(driver);
        costsCheckerPage = new CostsCheckerPage(driver);
        dateOfBirthPage = new DateOfBirthPage(driver);
        paidUniversalCreditPage = new PaidUniversalCreditPage(driver);
        benefitsPage = new BenefitsPage(driver);
        savingsPage = new SavingsPage(driver);
        pregnantOrGivenBirthPage = new PregnantOrGivenBirthPage(driver);
    }

    @Then("^I see the (.*)$")
    public void iSeeTheOutput(String output) {
        switch (output) {
            /*Cost Checker Tool Journey Pages*/
            case "Start Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(NHS_COSTS_START_PAGE_URL));
                Assert.assertEquals(commonPage.getCurrentPageTitle(), NHS_COSTS_START_PAGE_TITLE);
                break;
            case "Snap Survey Page":
                Assert.assertTrue(commonPage.getSnapSurveyPageUrl().contains(SNAP_SURVEY_PAGE_URL));
                Assert.assertEquals(commonPage.getSnapSurveyPageTitle(), SNAP_SURVEY_PAGE_TITLE);
                break;
            case "Where You Live Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(WHERE_YOU_LIVE_PAGE_URL));
                break;
            case "GP In Scotland or Wales Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(GP_SCOTLAND_OR_WALES_PAGE_URL));
                break;
            case "Live In Highlands Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(LIVE_IN_HIGHLANDS_PAGE_URL));
                break;
            case "NI Cannot Use Service Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(NI_CANNOT_USE_SERVICE_PAGE_URL));
                break;
            case "Dental Practice Country Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(DENTAL_PRACTICE_COUNTRY_PAGE_URL));
                break;
            case "Date of Birth Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(DATE_OF_BIRTH_PAGE_URL));
                break;
            case "Live With Partner Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(LIVE_WITH_PARTNER_PAGE_URL));
                break;
            case "Partner Claim Benefits Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(PARTNER_CLAIM_BENEFITS_PAGE_URL));
                break;
            case "Claim Benefits Tax Credits Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(CLAIM_BENEFITS_TAX_CREDITS_PAGE_URL));
                break;
            case "Paid Universal Credit Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(GET_PAID_UNIVERSAL_CREDIT_PAGE_URL));
                break;
            case "Universal Credit Claim Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(UNIVERSAL_CREDIT_CLAIM_PAGE_URL));
                break;
            case "Universal Credit Take Home Pay Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(UNIVERSAL_CREDIT_TAKE_HOME_PAY_PAGE_URL));
                break;
            case "Result Universal Credit Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(RESULT_UNIVERSAL_CREDIT_PAGE_URL));
                break;
            case "Awaiting Universal Credit Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(AWAITING_UNIVERSAL_CREDIT_PAGE_URL));
                break;
            case "Benefits Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(BENEFITS_PAGE_URL));
                break;
            case"Tax Credit Type Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(TAX_CREDIT_TYPE_PAGE_URL));
                break;
            case"Result Qualifying Income Support Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(RESULT_QUALIFYING_INCOME_SUPPORT_PAGE_URL));
                break;
            case "Employment Support Allowance Type Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(ESA_TYPE_PAGE_URL));
                break;
            case "Jobseekers Allowance Type Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(JSA_TYPE_PAGE_URL));
                break;
            case "Pension Credit Type Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(PENSION_CREDIT_TYPE_PAGE_URL));
                break;
            case "Full Time Education Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(FULL_TIME_EDUCATION_PAGE_URL));
                break;
            case "Result Full Time Education Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(RESULT_FULL_TIME_EDUCATION_PAGE_URL));
                break;
            case"Pregnant Or Given Birth Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(PREGNANT_OR_GIVEN_BIRTH_PAGE_URL));
                break;
            case "Injury Or Illness Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(INJURY_OR_ILLNESS_PAGE_URL));
                break;
            case "Diabetes Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(DIABETES_PAGE_URL));
                break;
            case "Diabetes Medication Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(DIABETES_MEDICATION_PAGE_URL));
                break;
            case "List of Medical Conditions Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(LIST_OF_MEDICAL_CONDITIONS_PAGE_URL));
                break;
            case "Glaucoma Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(GLAUCOMA_PAGE_URL));
                break;
            case"Care Home Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(CARE_HOME_PAGE_URL));
                break;
            case"Local Council Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(LOCAL_COUNCIL_PAGE_URL));
                break;
            case "Result Council Help Care Home Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(RESULT_LOCAL_COUNCIL_PAGE_URL));
                break;
            case "Savings Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(SAVINGS_PAGE_URL));
                break;
            case "You Get Help With NHS Costs Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(RESULTS_YOU_GET_HELP_WITH_NHS_COSTS_PAGE_URL));
                break;
            case"Savings Investments Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(SAVINGS_INVESTMENTS_PAGE_TITLE));
                break;
            /*Footer Pages*/
            case "Privacy Policy Page":
                Assert.assertTrue(commonPage.getFooterLinksPageURL().contains(PRIVACY_POLICY_PAGE_URL));
                Assert.assertEquals(commonPage.getFooterLinksPageTitle(), PRIVACY_POLICY_PAGE_TITLE);
                break;
            case "Cookies Page":
                Assert.assertTrue(commonPage.getCurrentURL().contains(COOKIES_PAGE_URL));
                Assert.assertEquals(commonPage.getCurrentPageTitle(), COOKIES_PAGE_TITLE);
                break;
            case "Terms and Conditions Page":
                Assert.assertTrue(commonPage.getFooterLinksPageURL().contains(TERMS_AND_CONDITIONS_PAGE_URL));
                Assert.assertEquals(commonPage.getFooterLinksPageTitle(), TERMS_AND_CONDITIONS_PAGE_TITLE);
                break;
            case "Accessibility Page":
                Assert.assertTrue(commonPage.getFooterLinksPageURL().contains(ACCESSIBILITY_PAGE_URL));
                Assert.assertEquals(commonPage.getFooterLinksPageTitle(), ACCESSIBILITY_PAGE_TITLE);
                break;
            case "NHSBSA Page":
                Assert.assertTrue(commonPage.getFooterLinksPageURL().contains(NHSBSA_PAGE_URL));
                Assert.assertEquals(commonPage.getFooterLinksPageTitle(), NHSBSA_PAGE_TITLE);
                break;
            case "Open Government License Page":
                Assert.assertEquals(commonPage.getFooterLinksPageTitle(), OPEN_GOVERNMENT_LICENCE_PAGE);
                break;
            /*Error Message*/
            case "Where You Live In Error Message":
                Assert.assertEquals(costsCheckerPage.getWhereYouLiveErrorMessage(),"Select the country you live in");
                break;
            case "GP Scotland Wales Error Message":
                Assert.assertEquals(costsCheckerPage.getGPScotlandWalesErrorMessage(),"Select 'yes' if your GP practice is in Scotland or Wales");
                break;
            case "Live In Highlands Error Message":
                Assert.assertEquals(costsCheckerPage.getLiveInHighlandsErrorMessage(),"Select 'yes' if you live in the Highlands and Islands region");
                break;
            case "Dental Practice Error Message":
                Assert.assertEquals(costsCheckerPage.getDentalPracticeErrorMessage(),"Select which country your dental practice is in");
                break;
            case"Date Of Birth Error Message":
                Assert.assertEquals(dateOfBirthPage.getDateOfBirthErrorMessage(),"Enter your date of birth");
                break;
            case "Check The Year Error Message":
                Assert.assertEquals(dateOfBirthPage.getCheckTheYearErrorMessage(),"Check the year you were born is correct");
                break;
            case "Live With Partner Error Message":
                Assert.assertEquals(costsCheckerPage.getLiveWithPartnerErrorMessage(),"Select 'yes' if you live with a partner");
                break;
            case "Full Time Education Error Message":
                Assert.assertEquals(costsCheckerPage.getFullTimeEducationErrorMessage(), "Select 'yes' if you are in full time education");
                break;
            case"Partner Claim Benefits Error Message":
                Assert.assertEquals(costsCheckerPage.getPartnerClaimBenefitsErrorMessage(), "Select 'yes' if you or your partner are claiming any benefits or tax credits");
                break;
            case "Claim Benefits Error Message":
                Assert.assertEquals(costsCheckerPage.getClaimBenefitsErrorMessage(), "Select 'yes' if you are claiming any benefits or tax credits");
                break;
            case "Get Paid Universal Credit Error Message":
                Assert.assertEquals(paidUniversalCreditPage.getPaidUniversalCreditErrorMessage(), "Select 'yes' if you or your partner get paid Universal Credit");
                break;
            case "Benefits Error Message":
                Assert.assertEquals(benefitsPage.getBenefitsErrorMessage(), "Select which benefit you or your partner get or select 'no'");
                break;
            case "Universal Credit Claim Error Message":
                Assert.assertEquals(costsCheckerPage.getUniversalCreditClaimErrorMessage(),"Select 'yes' if your Universal Credit includes payments for a child or disability");
                break;
            case "Universal Credit Take Home Pay Error Message":
                Assert.assertEquals(costsCheckerPage.getUniversalCreditTakeHomePayErrorMessage(),"Select 'yes' if you or your partner's take-home pay was this amount or less");
                break;
            case"Pregnant Or Given Birth Error Message":
                Assert.assertEquals(pregnantOrGivenBirthPage.getPregnantOrGivenBirthErrorMessage(), "Select 'yes' if you are pregnant or have given birth in the last 12 months");
                break;
            case"Injury or Illness Error Message":
                Assert.assertEquals(costsCheckerPage.getIllnessOrInjuryErrorMessage(), "Select 'yes' if you have an illness or injury caused by serving in the armed forces");
                break;
            case"Diabetes Error Message":
                Assert.assertEquals(costsCheckerPage.getDiabetesErrorMessage(), "Select 'yes' if you have diabetes");
                break;
            case"Diabetes Medication Error Message":
                Assert.assertEquals(costsCheckerPage.getDiabetesMedicationErrorMessage(), "Select 'Yes' if you take medication to keep your blood sugar levels stable");
                break;
            case "Care Home Error Message":
                Assert.assertEquals(costsCheckerPage.getCareHomeErrorMessage(), "Select 'yes' if you or your partner permanently live in a care home");
                break;
            case "Local Council Error Message":
                Assert.assertEquals(costsCheckerPage.getLocalCouncilErrorMessage(), "Select 'yes' if your council pays towards your care home");
                break;
            case "Savings Error Message":
                Assert.assertEquals(savingsPage.getSavingsErrorMessage(), "Select 'yes' if you or your partner have savings, investments and property over this amount");
                break;

            case "List Of Medical Conditions Error Message":
                Assert.assertEquals(costsCheckerPage.getListOfMedicalConditionsErrorMessage(), "Select 'yes' if your medical condition is listed");
                break;
            case "Glaucoma Error Message":
                Assert.assertEquals(costsCheckerPage.getGlaucomaErrorMessage(), "Select 'yes' if you have glaucoma");
                break;
        }
    }
}
