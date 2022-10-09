@InjuryOrIllness @Regression

Feature: Validation of Injury or Illness page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Pregnant or Given Birth page

  Scenario Outline: Validate the options on Injury or Illness page
    When I <option> have an injury or illness caused by serving in the armed forces
    Then I see the <output>

    Examples:
      | option | output        |
      | do     | Diabetes Page |
      | do not | Diabetes Page |

  Scenario Outline: Validate the error on Injury or Illness page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                          |
      | Injury or Illness Error Message |

  Scenario Outline: Validate the back link functionality on Injury or Illness page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output                       |
      | Back link | Pregnant Or Given Birth Page |
