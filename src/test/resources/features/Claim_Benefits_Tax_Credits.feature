@ClaimBenefitsTaxCredits @Regression

Feature: Validation of Claim Benefits Tax Credits page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Date of Birth page
    And I do not live with a partner

  Scenario Outline: Validate the options on Claim Benefits Tax Credits page
    When I <option> claim benefits or tax credits
    Then I see the <output>

    Examples:
      | option | output                       |
      | do     | Paid Universal Credit Page   |
      | do not | Pregnant Or Given Birth Page |

  Scenario Outline: Validate the error on Claim Benefits Tax Credits page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                       |
      | Claim Benefits Error Message |

  Scenario Outline: Validate the back link functionality on Claim Benefits Tax Credits page
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                 |
      | Back link | Live With Partner Page |