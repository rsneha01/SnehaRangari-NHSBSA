@Benefits @Regression

Feature: Validation of Do You or Your Partner get any of these Benefits page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Partner Claim Benefits page

  Scenario Outline: Validation of options available on Benefits page when I continue from Paid Universal Credit page
    And I do not get paid universal credit
    When I select <checkBox> checkbox
    Then I see the <output>

    Examples:
      | checkBox                               | output                                 |
      | Tax Credits                            | Tax Credit Type Page                   |
      | Income Support                         | Result Qualifying Income Support Page  |
      | Employment and Support Allowance (ESA) | Employment Support Allowance Type Page |
      | Jobseeker's Allowance (JSA)            | Jobseekers Allowance Type Page         |
      | Pension Credit                         | Pension Credit Type Page               |
      | No, we don't get any of these          | Pregnant Or Given Birth Page           |

  Scenario Outline: Validation of options available on Benefits page when I continue from Awaiting Universal Credit Page
    And I have applied to get paid universal credit
    And I click the Next button
    When I select <checkBox> checkbox
    Then I see the <output>

    Examples:
      | checkBox                               | output                                 |
      | Tax Credits                            | Tax Credit Type Page                   |
      | Income Support                         | Result Qualifying Income Support Page  |
      | Employment and Support Allowance (ESA) | Employment Support Allowance Type Page |
      | Jobseeker's Allowance (JSA)            | Jobseekers Allowance Type Page         |
      | Pension Credit                         | Pension Credit Type Page               |
      | No, we don't get any of these          | Pregnant Or Given Birth Page           |

  Scenario Outline: Validate the error on Get Paid Universal Credit page
    And I do not get paid universal credit
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                 |
      | Benefits Error Message |

  Scenario Outline: Validate the back link functionality on Get Paid Universal Credit page
    And I do not get paid universal credit
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                     |
      | Back link | Paid Universal Credit Page |

  Scenario Outline: Validate the back link functionality on Get Paid Universal Credit page
    And I have applied to get paid universal credit
    And I click the Next button
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                         |
      | Back link | Awaiting Universal Credit Page |