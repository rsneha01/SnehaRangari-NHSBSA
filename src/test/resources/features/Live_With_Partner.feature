@LiveWithPartner @Regression

Feature: Validation of Live With Partner page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Date of Birth page

  Scenario Outline: Validate the options on Live With Partner page
    When I <option> live with a partner
    Then I see the <output>

    Examples:
      | option | output                          |
      | do     | Partner Claim Benefits Page     |
      | do not | Claim Benefits Tax Credits Page |

  Scenario Outline: Validate the error on Live With Partner page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                          |
      | Live With Partner Error Message |

  Scenario Outline: Validate the back link functionality on Live With Partner page
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output             |
      | Back link | Date of Birth Page |