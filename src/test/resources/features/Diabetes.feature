@Diabetes @Regression

Feature: Validation of Diabetes page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Injury Or Illness page

  Scenario Outline: Validate the options on Diabetes page
    When I <option> have diabetes
    Then I see the <output>

    Examples:
      | option | output                          |
      | do     | Diabetes Medication Page        |
      | do not | List of Medical Conditions Page |

  Scenario Outline: Validate the error on Diabetes page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                 |
      | Diabetes Error Message |

  Scenario Outline: Validate the back link functionality on Diabetes page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output                 |
      | Back link | Injury Or Illness Page |
