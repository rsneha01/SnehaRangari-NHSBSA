# nhsbsa-cost-checker-acceptance-tests

This project contains the acceptance tests for NHSBSA Cost Checker Tool.

The acceptance tests are built in Cucumber User Centric BDD framework using Gherkin language.

## **Quick start**

### **Prerequisite**

* Make sure Java and Maven are installed
* Clone the repo

### Building the project

#### Install the maven dependencies

`mvn clean install`

### Executing the tests

#### Set the environment variable

##### On Windows:
Open command prompt and set environment variable: 
set NHSBSA_COSTS_CHECKER=https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start

On MAC:
Open command prompt and set environment variable using below steps
1. Find the path to .bash_profile by using: ~/.bash-profile
2. Open the .bash_profile file with a text editor of your choice.
3. Scroll down to the end of the .bash_profile file.
4. Use the export command to add new environment variables:
export NHSBSA_COSTS_CHECKER=https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start
5. Save any changes you made to the .bash_profile file.
6. Execute the new .bash_profile by either restarting the terminal window or using: source ~/.bash-profile

#### To run the full regression suite:

##### Headless browser

`mvn clean verify -Dbrowser=headless -Dit.test=RegressionTestRunner`

##### Chrome browser

`mvn clean verify -Dbrowser=chrome -Dit.test=RegressionTestRunner`

##### Firefox browser

`mvn verify -Dbrowser=firefox -Dit.test=RegressionTestRunner`

#### To run specific tests:

Include the feature or scenario @tag in GenericTestRunner and run the below maven command

By default, @AcceptanceTests is added to the @tag that runs the "Acceptance_Tests_Results" feature file

##### Headless browser

`mvn clean verify -Dbrowser=headless -Dit.test=GenericTestRunner`

##### Chrome browser

`mvn clean verify -Dbrowser=chrome -Dit.test=GenericTestRunner`

##### Firefox browser

`mvn verify -Dbrowser=firefox -Dit.test=GenericTestRunner`

### Viewing the reports

Cucumber reports can be found in target folder of the project directory

Extent Spark reports can be found in test-reports folder of the project directory

## License

Released under the Apache 2 license.