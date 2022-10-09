@NHSCostsCheckStart @Regression

Feature: Validation of NHS Costs Check Help Start page

  Background:
    Given I launch the NHS Costs Check application


  Scenario Outline: Validate the start button on NHS Costs Check Start page
    And I see the <output1>
    When I click the <button>
    Then I see the <output2>

    Examples:
      | button           | output1    | output2             |
      | Start Now button | Start Page | Where You Live Page |

  Scenario Outline: Validate the functionality of Cookie Banner on NHS Costs Check Start page
    Then I see that the cookies banner is displayed
    When I select the <button>
    Then I will see the Cookie Banner message
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | button                          | hyperlink         | output       |
      | Accept Analytics Cookies button | Cookies Page link | Cookies Page |
      | Reject Analytics Cookies button | Cookies Page link | Cookies Page |

  Scenario Outline: Validate the hyperlink of Cookie Banner on NHS Costs Check Start page
    Then I see that the cookies banner is displayed
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink                    | output       |
      | Read More About Cookies link | Cookies Page |

  Scenario Outline: Validate the Footer Links on NHS Costs Check Start page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink                        | output                       |
      | Privacy Policy Footer link       | Privacy Policy Page          |
      | Terms and Conditions Footer link | Terms and Conditions Page    |
      | Accessibility Footer link        | Accessibility Page           |
      | NHSBSA Footer link               | NHSBSA Page                  |
      | Open Government Licence link     | Open Government License Page |
      | Cookies Footer link              | Cookies Page                 |

  Scenario Outline: Validate the beta banner on NHS Costs Check Start page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink                 | output           |
      | Beta Banner Feedback link | Snap Survey Page |