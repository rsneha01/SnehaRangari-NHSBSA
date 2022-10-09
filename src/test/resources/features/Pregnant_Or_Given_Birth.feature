@PregnantOrGivenBirth @Regression

Feature: Validation of Are You Pregnant or Given Birth page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Claim Benefits page

  Scenario Outline: Validate the options on Are You Pregnant or Given Birth page
    When I <option> pregnant or given birth in the last twelve months
    Then I see the <output>

    Examples:
      | option | output                 |
      | am     | Injury Or Illness Page |
      | am not | Injury Or Illness Page |

  Scenario Outline: Validate the error on Are You Pregnant or Given Birth page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                                |
      | Pregnant Or Given Birth Error Message |

  Scenario Outline: Validate the back link functionality on Are You Pregnant or Given Birth page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output                      |
      | Back link | Partner Claim Benefits Page |

