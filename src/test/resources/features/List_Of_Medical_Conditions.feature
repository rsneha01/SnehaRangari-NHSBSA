@ListOfMedicalConditions @Regression

Feature: Validation of List Of Medical Conditions page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Injury Or Illness page
    And I do not have diabetes

  Scenario Outline: Validate the options on List Of Medical Conditions page
    When I <option> affected by the List Of Medical Conditions
    Then I see the <output>

    Examples:
      | option | output        |
      | am     | Glaucoma Page |
      | am not | Glaucoma Page |

  Scenario Outline: Validate the error on List Of Medical Conditions page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                                   |
      | List Of Medical Conditions Error Message |

  Scenario Outline: Validate the back link functionality on List Of Medical Conditions page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output        |
      | Back link | Diabetes Page |
