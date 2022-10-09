@DiabetesMedication @Regression

Feature: Validation of Diabetes Medication page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Diabetes page

  Scenario Outline: Validate the options on Diabetes Medication page
    When I <option> need to take medication
    Then I see the <output>

    Examples:
      | option | output                          |
      | do     | Care Home Page                  |
      | do not | List of Medical Conditions Page |

  Scenario Outline: Validate the error on Diabetes Medication page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                            |
      | Diabetes Medication Error Message |

  Scenario Outline: Validate the back link functionality on Diabetes Medication page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output        |
      | Back link | Diabetes Page |
