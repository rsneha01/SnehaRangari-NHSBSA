@FullTimeEducation @Regression

Feature: Validation of Full Time Education page

  Background:
    Given I launch the NHS Costs Check application
    And I have selected my option on Dental Practice page

  Scenario Outline: Validate the options on Full Time Education page
    And I enter 29 02 2004 on date of birth and continue
    When I <option> in full time education
    Then I see the <output>

    Examples:
      | option | output                          |
      | am     | Result Full Time Education Page |
      | am not | Live With Partner Page          |

  Scenario Outline: Validate the error on Full Time Education page
    And I enter 29 02 2004 on date of birth and continue
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                            |
      | Full Time Education Error Message |

  Scenario Outline: Validate the back link functionality on Dental Practice page
    And I enter 29 02 2004 on date of birth and continue
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output             |
      | Back link | Date of Birth Page |