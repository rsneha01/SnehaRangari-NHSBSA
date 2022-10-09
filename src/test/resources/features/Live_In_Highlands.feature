@LiveInHighlands @Regression

Feature: Validation of Live In Highlands page

  Background:
    Given I launch the NHS Costs Check application
    And I start my NHSBSA Cost Check and select country Scotland

  Scenario Outline: Validate the options on Live In Highlands page
    And I <option> live in the Highlands and Islands
    Then I see the <output>

    Examples:
      | option | output                       |
      | do     | Dental Practice Country page |
      | do not | Dental Practice Country page |

  Scenario Outline: Validate the error message on Live In Highlands page
    And I click the Next button
    Then I see the <output>

    Examples:
      | output                          |
      | Live In Highlands Error Message |

  Scenario Outline: Validate the back link functionality on Where You Live In page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output              |
      | Back link | Where You Live Page |