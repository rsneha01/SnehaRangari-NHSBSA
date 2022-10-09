package com.nhsbsa.costchecker.stepdefs;

import com.nhsbsa.costchecker.driver.Config;
import com.nhsbsa.costchecker.pageobjects.CostsCheckerPage;
import com.nhsbsa.costchecker.pageobjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CostsCheckerStepDef {

    private CostsCheckerPage costsCheckerPage;
    private DateOfBirthPage dateOfBirthPage;
    private WebDriver driver;
    private BenefitsPage benefitsPage;
    private SavingsPage savingsPage;
    private PregnantOrGivenBirthPage pregnantOrGivenBirthPage;

    public CostsCheckerStepDef() {
        driver = Config.getDriver();
        costsCheckerPage = new CostsCheckerPage(driver);
        dateOfBirthPage = new DateOfBirthPage(driver);
        benefitsPage = new BenefitsPage(driver);
        savingsPage = new SavingsPage(driver);
        pregnantOrGivenBirthPage = new PregnantOrGivenBirthPage(driver);
    }

    @When("^I select (.*) and continue$")
    public void iSelectOptionAndContinue(String option) {
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
            case "Northern Ireland":
                costsCheckerPage.selectCountryNorthernIreland();
                costsCheckerPage.nextButton();
                break;
            case "Northern Ireland Dental":
                costsCheckerPage.selectDentalPracticeCountryNI();
                costsCheckerPage.nextButton();
                break;
            case "Not Registered with DP":
                costsCheckerPage.selectNotRegisteredWithDentalPractice();
                costsCheckerPage.nextButton();
                break;
        }
    }

    @When("^I (.*) GP Practice in Scotland or Wales$")
    public void iOptionGPPracticeInScotlandOrWales(String option) {
        switch (option) {
            case "do have":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not have":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }

    @And("^I (.*) live in the Highlands and Islands$")
    public void iOptionLiveInTheHighlandsAndIslands(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I enter (.*) (.*) (.*) on date of birth and continue$")
    public void iEnterDayMonthYearOnDateOfBirthAndContinue(String day, String month, String year) {
        dateOfBirthPage.enterDateOfBirthAndClickNext(day, month, year);
    }
    @When("^I (.*) live with a partner$")
    public void iOptionLiveWithAPartner(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) claim benefits or tax credits$")
    public void iOptionClaimBenefitsOrTaxCredits(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) in full time education$")
    public void iOptionInFullTimeEducation(String option) {
        switch (option) {
            case "am":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "am not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) pregnant or given birth in the last twelve months$")
    public void iOptionPregnantOrGivenBirthInTheLastMonths(String option) {
        switch (option) {
            case "am":
                pregnantOrGivenBirthPage.selectYesRadioButtonAndClickNext();
                break;
            case "am not":
                pregnantOrGivenBirthPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) have an injury or illness caused by serving in the armed forces$")
    public void iOptionHaveAnInjuryOrIllnessCausedByServingInTheArmedForces(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) have diabetes$")
    public void iOptionHaveDiabetes(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) need to take medication$")
    public void iOptionNeedToTakeMedication(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) live in a care home$")
    public void iOptionLiveInACareHome(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) get help to pay from local council$")
    public void iOptionGetHelpToPayFromLocalCouncil(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }
    @When("^I (.*) have savings, investments and property over this amount$")
    public void iOptionHaveMoreThanAmountInSavingsInvestmentsOrProperty(String option) {
        switch (option) {
            case "do":
                savingsPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                savingsPage.selectNoRadioButtonAndClickNext();
                break;
        }

    }

    @When("^I (.*) affected by the List Of Medical Conditions$")
    public void iOptionAffectedByTheListOfMedicalConditions(String option) {
        switch (option) {
            case "am":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "am not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }

    @When("^I (.*) have glaucoma$")
    public void iOptionHaveGlaucoma(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }

    @When("^I (.*) have Universal Credit Claim$")
    public void iOptionHaveUniversalCreditClaim(String option) {
        switch (option) {
            case "do":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "do not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }

    @When("^I (.*) used the Universal Credit Take Home Pay$")
    public void iOptionUsedTheUniversalCreditTakeHomePay(String option) {
        switch (option) {
            case "have":
                costsCheckerPage.selectYesRadioButtonAndClickNext();
                break;
            case "have not":
                costsCheckerPage.selectNoRadioButtonAndClickNext();
                break;
        }
    }


}
