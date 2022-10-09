@Glaucoma @Regression

Feature: Validation of Glaucoma page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until List of Medical Conditions page

  Scenario Outline: Validate the options on Glaucoma page
    When I <option> have glaucoma
    Then I see the <output>

    Examples:
      | option | output         |
      | do     | Care Home Page |
      | do not | Care Home Page |

  Scenario Outline: Validate the error on Glaucoma page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                 |
      | Glaucoma Error Message |

  Scenario Outline: Validate the back link functionality on Glaucoma page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output                          |
      | Back link | List of Medical Conditions Page |
