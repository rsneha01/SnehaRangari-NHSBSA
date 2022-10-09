@LocalCouncilHelp @Regression

Feature: Validation of Local Council page

  Background:
    Given I launch the NHS Costs Check application
    And I enter my details until Care Home page

  Scenario Outline: Validate the options on Local Council page
    When I <option> get help to pay from local council
    Then I see the <output>

    Examples:
      | option | output                             |
      | do     | Result Council Help Care Home Page |
      | do not | Savings Page                       |

  Scenario Outline: Validate the error on Local Council page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                      |
      | Local Council Error Message |

  Scenario Outline: Validate the back link functionality on Local Council page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output         |
      | Back link | Care Home Page |
