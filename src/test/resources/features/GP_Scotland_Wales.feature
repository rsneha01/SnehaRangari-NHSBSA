@GPScotlandOrWales @Regression

Feature: Validation of GP Practice in Scotland or Wales page

  Background:
    Given I launch the NHS Costs Check application

  Scenario Outline: Validate the options on GP Practice in Scotland or Wales page
    And I start my NHSBSA Cost Check and select country England
    When I <option> GP Practice in Scotland or Wales
    Then I see the <output>

    Examples:
      | option      | output                       |
      | do have     | Dental Practice Country page |
      | do not have | Dental Practice Country page |

  Scenario Outline: Validate the options on GP Practice in Scotland or Wales page
    And I start my NHSBSA Cost Check and select country Wales
    When I <option> GP Practice in Scotland or Wales
    Then I see the <output>

    Examples:
      | option      | output                       |
      | do have     | Dental Practice Country page |
      | do not have | Dental Practice Country page |

  Scenario Outline: Validate the error message on GP Practice in Scotland or Wales Page
    And I start my NHSBSA Cost Check and select country England
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                          |
      | GP Scotland Wales Error Message |

  Scenario Outline: Validate the back link functionality on GP Practice in Scotland or Wales Page
    And I start my NHSBSA Cost Check and select country England
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output              |
      | Back link | Where You Live Page |
