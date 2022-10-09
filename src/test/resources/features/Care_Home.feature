@CareHome @Regression

Feature: Validation of Care Home page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Diabetes Medication page

  Scenario Outline: Validate the options on Care Home page
    When I <option> live in a care home
    Then I see the <output>

    Examples:
      | option | output             |
      | do     | Local Council Page |
      | do not | Savings Page       |

  Scenario Outline: Validate the error on Care Home page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                  |
      | Care Home Error Message |

  Scenario Outline: Validate the back link functionality on Care Home page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output                   |
      | Back link | Diabetes Medication Page |
