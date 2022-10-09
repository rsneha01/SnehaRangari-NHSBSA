@WhereYouLive @Regression

Feature: Validation of Where You Live In page

  Background:
    Given I launch the NHS Costs Check application
    And I start my NHSBSA Cost Check

  Scenario Outline: Validate the options on Where You Live In page
    When I select <option> and continue
    Then I see the <output>

    Examples:
      | option           | output                          |
      | England          | GP In Scotland or Wales Page    |
      | Scotland         | Live In Highlands Page          |
      | Wales            | GP In Scotland or Wales Page    |
      | Northern Ireland | NI Cannot Use Service Page      |

  Scenario Outline: Validate the error on Where You Live In page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                          |
      | Where You Live In Error Message |

  Scenario Outline: Validate the back link functionality on Where You Live In page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output     |
      | Back link | Start Page |