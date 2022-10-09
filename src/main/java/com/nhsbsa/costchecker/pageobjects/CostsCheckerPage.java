package com.nhsbsa.costchecker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CostsCheckerPage extends Page {

    public CostsCheckerPage(WebDriver driver) {
        super(driver);
    }

    private By startNowButtonLocator = By.id("next-button");
    private By nextButtonLocator = By.id("next-button");
    private By countryEnglandLocator = By.id("radio-england");
    private By countryScotlandLocator = By.id("radio-scotland");
    private By countryWalesLocator = By.id("radio-wales");
    private By countryNorthernIrelandLocator = By.id("radio-nire");
    private By dentalPracticeNILocator = By.id("radio-ni");
    private By yesRadioButtonLocator = By.id("radio-yes");
    private By noRadioButtonLocator = By.id("radio-no");
    private By notRegisteredWithDentalPracticeLocator = By.id("radio-not-registered");
    private By whereYouLiveErrorLocator = By.linkText("Select the country you live in");
    private By gpScotlandWalesErrorLocator = By.linkText("Select 'yes' if your GP practice is in Scotland or Wales");
    private By liveInHighlandsErrorLocator = By.linkText("Select 'yes' if you live in the Highlands and Islands region");
    private By dentalPracticeErrorLocator = By.linkText("Select which country your dental practice is in");
    private By liveWithPartnerErrorLocator = By.linkText("Select 'yes' if you live with a partner");
    private By fullTimeEducationErrorLocator = By.linkText("Select 'yes' if you are in full time education");
    private By partnerClaimBenefitsErrorLocator = By.linkText("Select 'yes' if you or your partner are claiming any benefits or tax credits");
    private By claimBenefitsErrorLocator = By.linkText("Select 'yes' if you are claiming any benefits or tax credits");
    private By universalCreditClaimErrorLocator = By.linkText("Select 'yes' if your Universal Credit includes payments for a child or disability");
    private By universalCreditTakeHomePayErrorLocator = By.linkText("Select 'yes' if you or your partner's take-home pay was this amount or less");
    private By illnessOrInjuryErrorLocator = By.linkText("Select 'yes' if you have an illness or injury caused by serving in the armed forces");
    private By diabetesErrorLocator = By.linkText("Select 'yes' if you have diabetes");
    private By diabetesMedicationErrorLocator = By.linkText("Select 'Yes' if you take medication to keep your blood sugar levels stable");
    private By careHomeErrorLocator = By.linkText("Select 'yes' if you or your partner permanently live in a care home");
    private By localCouncilErrorLocator = By.linkText("Select 'yes' if your council pays towards your care home");
    private By listOfMedicalConditionsErrorLocator = By.linkText("Select 'yes' if your medical condition is listed");
    private By glaucomaErrorLocator = By.linkText("Select 'yes' if you have glaucoma");

    public void startNowButton() {
        clickEvent(startNowButtonLocator);
    }

    public void nextButton() {
        clickEvent(nextButtonLocator);
    }

    public void selectCountryEngland() {
        clickEvent(countryEnglandLocator);
    }

    public void selectCountryScotland() {
        clickEvent(countryScotlandLocator);
    }

    public void selectCountryWales() {
        clickEvent(countryWalesLocator);
    }

    public void selectCountryNorthernIreland() {
        clickEvent(countryNorthernIrelandLocator);
    }

    public void selectDentalPracticeCountryNI() {
        clickEvent(dentalPracticeNILocator);
    }

    public void selectNotRegisteredWithDentalPractice() {
        clickEvent(notRegisteredWithDentalPracticeLocator);
    }

    public void selectYesRadioButtonAndClickNext() {
        clickEvent(yesRadioButtonLocator);
        nextButton();
    }

    public void selectNoRadioButtonAndClickNext() {
        clickEvent(noRadioButtonLocator);
        nextButton();
    }

    public String getWhereYouLiveErrorMessage() {
        return getElementText(whereYouLiveErrorLocator);
    }

    public String getGPScotlandWalesErrorMessage() {
        return getElementText(gpScotlandWalesErrorLocator);
    }

    public String getLiveInHighlandsErrorMessage() {
        return getElementText(liveInHighlandsErrorLocator);
    }

    public String getDentalPracticeErrorMessage() {
        return getElementText(dentalPracticeErrorLocator);
    }

    public String getLiveWithPartnerErrorMessage() {
        return getElementText(liveWithPartnerErrorLocator);
    }

    public String getFullTimeEducationErrorMessage() {
        return getElementText(fullTimeEducationErrorLocator);
    }

    public String getPartnerClaimBenefitsErrorMessage() {
        return getElementText(partnerClaimBenefitsErrorLocator);
    }

    public String getClaimBenefitsErrorMessage() {
        return getElementText(claimBenefitsErrorLocator);
    }

    public String getUniversalCreditClaimErrorMessage() {
        return getElementText(universalCreditClaimErrorLocator);
    }

    public String getUniversalCreditTakeHomePayErrorMessage() {
        return getElementText(universalCreditTakeHomePayErrorLocator);
    }

    public String getIllnessOrInjuryErrorMessage() {
        return getElementText(illnessOrInjuryErrorLocator);
    }

    public String getDiabetesErrorMessage() {
        return getElementText(diabetesErrorLocator);
    }

    public String getDiabetesMedicationErrorMessage() {
        return getElementText(diabetesMedicationErrorLocator);
    }

    public String getCareHomeErrorMessage() {
        return getElementText(careHomeErrorLocator);
    }

    public String getLocalCouncilErrorMessage() {
        return getElementText(localCouncilErrorLocator);
    }

    public String getListOfMedicalConditionsErrorMessage() {
        return getElementText(listOfMedicalConditionsErrorLocator);
    }

    public String getGlaucomaErrorMessage() {
        return getElementText(glaucomaErrorLocator);
    }
}
