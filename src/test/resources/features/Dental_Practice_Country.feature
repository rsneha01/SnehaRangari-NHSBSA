@DentalPracticeCountry @Regression

Feature: Validation of Country of Dental Practice page

  Background:
    Given I launch the NHS Costs Check application

  Scenario Outline: Validate the options on Country of Dental Practice page
    And I start my NHSBSA Cost Check and select country England
    And I <option1> GP Practice in Scotland or Wales
    When I select <option2> and continue
    Then I see the <output>

    Examples:
      | option1     | option2                 | output             |
      | do have     | England                 | Date of Birth Page |
      | do have     | Scotland                | Date of Birth Page |
      | do have     | Wales                   | Date of Birth Page |
      | do have     | Northern Ireland Dental | Date of Birth Page |
      | do have     | Not Registered with DP  | Date of Birth Page |
      | do not have | England                 | Date of Birth Page |
      | do not have | Scotland                | Date of Birth Page |
      | do not have | Wales                   | Date of Birth Page |
      | do not have | Northern Ireland Dental | Date of Birth Page |
      | do not have | Not Registered with DP  | Date of Birth Page |

  Scenario Outline: Validate the options on Country of Dental Practice page
    And I start my NHSBSA Cost Check and select country Wales
    And I <option1> GP Practice in Scotland or Wales
    When I select <option2> and continue
    Then I see the <output>

    Examples:
      | option1     | option2                 | output             |
      | do have     | England                 | Date of Birth Page |
      | do have     | Scotland                | Date of Birth Page |
      | do have     | Wales                   | Date of Birth Page |
      | do have     | Northern Ireland Dental | Date of Birth Page |
      | do have     | Not Registered with DP  | Date of Birth Page |
      | do not have | England                 | Date of Birth Page |
      | do not have | Scotland                | Date of Birth Page |
      | do not have | Wales                   | Date of Birth Page |
      | do not have | Northern Ireland Dental | Date of Birth Page |
      | do not have | Not Registered with DP  | Date of Birth Page |

  Scenario Outline: Validate the options on Country of Dental Practice page
    And I start my NHSBSA Cost Check and select country Scotland
    And I <option1> GP Practice in Scotland or Wales
    When I select <option2> and continue
    Then I see the <output>

    Examples:
      | option1     | option2                 | output             |
      | do have     | England                 | Date of Birth Page |
      | do have     | Scotland                | Date of Birth Page |
      | do have     | Wales                   | Date of Birth Page |
      | do have     | Northern Ireland Dental | Date of Birth Page |
      | do have     | Not Registered with DP  | Date of Birth Page |
      | do not have | England                 | Date of Birth Page |
      | do not have | Scotland                | Date of Birth Page |
      | do not have | Wales                   | Date of Birth Page |
      | do not have | Northern Ireland Dental | Date of Birth Page |
      | do not have | Not Registered with DP  | Date of Birth Page |

  Scenario Outline: Validate the error message on Dental Practice page
    And I start my NHSBSA Cost Check and select country England
    And I do have GP Practice in Scotland or Wales
    When I click the Next button
    Then I see the <output>
    Examples:
      | output                        |
      | Dental Practice Error Message |

  Scenario Outline: Validate the back link functionality on Dental Practice page
    And I start my NHSBSA Cost Check and select country England
    And I do have GP Practice in Scotland or Wales
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                       |
      | Back link | GP In Scotland or Wales Page |