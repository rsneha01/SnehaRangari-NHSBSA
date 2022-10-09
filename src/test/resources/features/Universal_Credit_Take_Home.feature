@UniversalCreditTakeHomePay @Regression

Feature: Validation of Universal Credit Take Home Pay page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Universal Credit Claim page

  Scenario Outline: Validate the options on Universal Credit Take Home Pay page
    When I <option> used the Universal Credit Take Home Pay
    Then I see the <output>

    Examples:
      | option   | output                       |
      | have     | Result Universal Credit Page |
      | have not | Pregnant Or Given Birth Page |


  Scenario Outline: Validate the error on Universal Credit Take Home Pay page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                                       |
      | Universal Credit Take Home Pay Error Message |

  Scenario Outline: Validate the back link functionality on Universal Credit Take Home Pay page
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                      |
      | Back link | Universal Credit Claim Page |