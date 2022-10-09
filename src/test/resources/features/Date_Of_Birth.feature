@DateOfBirth @Regression

Feature: Validation of Date of Birth page

  Background:
    Given I launch the NHS Costs Check application
    And I have selected my option on Dental Practice page

  Scenario Outline: Validate the functionality of date of birth page with correct and incorrect date format
    When I enter <day> <month> <year> on date of birth and continue
    Then I see the <output>

    Examples:
      #Correct date format
      | day | month | year | output                       |
      | 01  | 01    | 1999 | Live With Partner Page       |
      | 31  | 12    | 2000 | Live With Partner Page       |
      | 29  | 02    | 2004 | Full Time Education Page     |
      | 28  | 02    | 2003 | Live With Partner Page       |
      | 1   | 10    | 1989 | Live With Partner Page       |
      | 20  | 9     | 1979 | Live With Partner Page       |
      #Incorrect date format
      | 00  | 1     | 1999 | Date Of Birth Error Message  |
      | 1   | 0     | 2000 | Date Of Birth Error Message  |
      | 12  | 12    | 0000 | Check The Year Error Message  |
      | @   | 12    | 2002 | Date Of Birth Error Message  |
      | 31  | 1     | $%$! | Date Of Birth Error Message  |
      | 12  | !     | 1998 | Date Of Birth Error Message  |
      | 32  | 5     | 2000 | Date Of Birth Error Message  |
      | 31  | 13    | 2001 | Date Of Birth Error Message  |
      | 22  | 12    | 199  | Check The Year Error Message |
      | 12  | 11    | 1900 | Check The Year Error Message |

  Scenario Outline: Validate the back link functionality on Date of Birth page
    When I select the <hyperlink>
    Then I see the <output>
    Examples:
      | hyperlink | output                       |
      | Back link | Dental Practice Country Page |



