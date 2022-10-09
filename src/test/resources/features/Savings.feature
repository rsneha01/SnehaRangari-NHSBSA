@Savings @Regression

Feature: Validation of Savings page

  Background:
    Given I launch the NHS Costs Check application

  Scenario Outline: Validate the options on Savings more than pound 23,250 page
    And I enter my details until Local Council page
    When I <option> have savings, investments and property over this amount
    Then I see the <output>

    Examples:
      | option | output                           |
      | do     | You Get Help With NHS Costs Page |
      | do not | You Get Help With NHS Costs Page |

  Scenario Outline: Validate the error on Savings more than pound 23,250 page
    And I enter my details until Local Council page
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                |
      | Savings Error Message |

  Scenario Outline: Validate the back link functionality on Savings more than pound 23,250 page
    And I enter my details until Local Council page
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output             |
      | Back link | Local Council Page |

  Scenario Outline: Validate the options on Savings more than pound 24,000 page
    And I enter my details until Care Home page
    And I do not get help to pay from local council
    When I <option> have savings, investments and property over this amount
    Then I see the <output>

    Examples:
      | option | output                           |
      | do     | You Get Help With NHS Costs Page |
      | do not | You Get Help With NHS Costs Page |


  Scenario Outline: Validate the error on Savings more than pound 24,000 page
    And I enter my details until Care Home page
    And I do not get help to pay from local council
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                |
      | Savings Error Message |

  Scenario Outline: Validate the back link functionality on Savings more than pound 24,000 page
    And I enter my details until Care Home page
    And I do not get help to pay from local council
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output             |
      | Back link | Local Council Page |

  Scenario Outline: Validate the options on Savings more than pound 16,000 page
    And I enter my details until Diabetes Medication page
    And I do not live in a care home
    When I <option> have savings, investments and property over this amount
    Then I see the <output>

    Examples:
      | option | output                           |
      | do     | You Get Help With NHS Costs Page |
      | do not | You Get Help With NHS Costs Page |

  Scenario Outline: Validate the error on Savings more than pound 16,000 page
    And I enter my details until Diabetes Medication page
    And I do not live in a care home
    When I click the Next button
    Then I see the <output>

    Examples:
      | output                |
      | Savings Error Message |

  Scenario Outline: Validate the back link functionality on Savings more than pound 16,000 page
    And I enter my details until Diabetes Medication page
    And I do not live in a care home
    When I select the <hyperlink>
    Then I see the <output>

    Examples:
      | hyperlink | output         |
      | Back link | Care Home Page |