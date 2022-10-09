@PaidUniversalCredit @Regression

Feature: Validation of Get Paid Universal Credit page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Partner Claim Benefits page

  Scenario Outline: Validate the options on Get Paid Universal Credit page
    When I <option> get paid universal credit
    Then I see the <output>

    Examples:
      | option          | output                         |
      | do              | Universal Credit Claim Page    |
      | have applied to | Awaiting Universal Credit Page |
      | do not          | Benefits Page                  |

  Scenario Outline: Validate the error on Get Paid Universal Credit page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                                  |
      | Get Paid Universal Credit Error Message |

  Scenario Outline: Validate the back link functionality on Get Paid Universal Credit page
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                      |
      | Back link | Partner Claim Benefits Page |