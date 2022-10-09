@AcceptanceTests @Regression

Feature: I get a result of whether I will get help or not upon entering my circumstances

  Background:
    Given I launch the NHS Costs Check application

  Scenario Outline: My circumstances - I have diabetes and I get help from local council
    And I start my NHSBSA Cost Check and select country England
    And I do have GP Practice in Scotland or Wales
    And I select England and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I do live with a partner
    And I do not claim benefits or tax credits
    And I am pregnant or given birth in the last twelve months
    And I do have an injury or illness caused by serving in the armed forces
    And I do have diabetes
    And I do need to take medication
    And I do live in a care home
    When I do get help to pay from local council
    Then I see the <output>

    Examples:
      | day | month | year | output                             |
      | 01  | 01    | 1999 | Result Council Help Care Home Page |

  Scenario Outline: My circumstances - I have Glaucoma and I get help from local council
    And I start my NHSBSA Cost Check and select country Wales
    And I do not have GP Practice in Scotland or Wales
    And I select Wales and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I do live with a partner
    And I do not claim benefits or tax credits
    And I am pregnant or given birth in the last twelve months
    And I do not have an injury or illness caused by serving in the armed forces
    And I do not have diabetes
    And I do have glaucoma
    And I do live in a care home
    And I do get help to pay from local council
    Then I see the <output>

    Examples:
      | day | month | year | output                             |
      | 1   | 1     | 2000 | Result Council Help Care Home Page |

  Scenario Outline: My circumstances - I am in full time education
    And I start my NHSBSA Cost Check and select country Scotland
    And I do live in the Highlands and Islands
    And I select Scotland and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I am in full time education
    Then I see the <output>

    Examples:
      | day | month | year | output                          |
      | 10  | 10    | 2004 | Result Full Time Education Page |

  Scenario Outline: My circumstances - I use the universal credit take home pay
    And I start my NHSBSA Cost Check and select country Scotland
    And I do live in the Highlands and Islands
    And I select Scotland and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I am not in full time education
    And I do not live with a partner
    And I do claim benefits or tax credits
    And I do get paid universal credit
    And I do have Universal Credit Claim
    When I have used the Universal Credit Take Home Pay
    Then I see the <output>

    Examples:
      | day | month | year | output                       |
      | 10  | 10    | 2004 | Result Universal Credit Page |

  Scenario Outline: My circumstances - I have savings, investments or property
    And I start my NHSBSA Cost Check and select country Wales
    And I do not have GP Practice in Scotland or Wales
    And I select Wales and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I do live with a partner
    And I do not claim benefits or tax credits
    And I am pregnant or given birth in the last twelve months
    And I do not have an injury or illness caused by serving in the armed forces
    And I do not have diabetes
    And I do have glaucoma
    And I do live in a care home
    And I do not get help to pay from local council
    And I do have savings, investments and property over this amount
    Then I see the <output>

    Examples:
      | day | month | year | output                           |
      | 1   | 1     | 2000 | You Get Help With NHS Costs Page |

  Scenario Outline: My circumstances - I have used the Universal Credit Take Home Pay
    And I start my NHSBSA Cost Check and select country Wales
    And I do not have GP Practice in Scotland or Wales
    And I select Wales and continue
    And I enter <day> <month> <year> on date of birth and continue
    And I do live with a partner
    And I do claim benefits or tax credits
    And I do get paid universal credit
    And I do have Universal Credit Claim
    And I have used the Universal Credit Take Home Pay
    Then I see the <output>

    Examples:
      | day | month | year | output                       |
      | 1   | 1     | 2000 | Result Universal Credit Page |

  Scenario Outline: My circumstances - I live in Northern Ireland
    When I start my NHSBSA Cost Check and select country Northern Ireland
    Then I see the <output>

    Examples:
      | output                     |
      | NI Cannot Use Service Page |