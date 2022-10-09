@UniversalCreditClaim @Regression

Feature: Validation of Universal Credit Claim page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Partner Claim Benefits page

  Scenario Outline: Validate the options on Universal Credit Claim page
    And I do get paid universal credit
    When I <option> have Universal Credit Claim
    Then I see the <output>

    Examples:
      | option | output                              |
      | do     | Universal Credit Take Home Pay Page |
      | do not | Universal Credit Take Home Pay Page |


  Scenario Outline: Validate the error on Universal Credit Claim page
    And I do get paid universal credit
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                               |
      | Universal Credit Claim Error Message |

  Scenario Outline: Validate the back link functionality on Universal Credit Claim page
    And I do get paid universal credit
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                         |
      | Back link | Get Paid Universal Credit Page |