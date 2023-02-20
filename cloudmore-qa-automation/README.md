
# BDD Cucumber + RestAssuerd + Selenium + TestNG Automation Framework


This is created for cloudmore Assignment Task

## Documentation

[Test Cases and RTM Documentation](https://docs.google.com/spreadsheets/d/1wfWEoti211CMlETvXfXzlRpivtpUoP8SOtb6sZGbmDI/edit?usp=sharing)

**Test Cases and RTM Documentation Local Path** :  ```Documentations/cloudmore-assignment-from-Dhanushka Akila.xlsx```


## Tech Stack

**REST API Invoking:** Rest-Assuered

**Writing Test and execution :** Cucumber , TestNG

**Main Lanugage:** JAVA

**Json Mapping:** Jackson

**Reporting:** Cucumber Report , Extent Report , Allure Report

**Excel Data Managment:** poiji 

**POJO Classes:** Lombok 
## Pre Requisites

*apache-maven-3.8.6*

*JAVA 11*

*allure 2.20.1*




## Running Tests

To run tests, run the following Steps and command

You Can download this repo from Github
or 
You can simple clone this repo from GitHub


```git
  git clone https://github.com/asamaranayake/cloudmore-qa-automation.git
```

To Execute the all Tests 

```bash
mvn clean test
```
To Execute specific test

To Run UI automation Test cases only 

```bash
mvn clean install -Dcucumber.filter.tags="@ui"
```

To Run API Automtion Test cases only 

```bash
mvn clean install -Dcucumber.filter.tags="@API"
```
## Test Reporting

Test Report file Locations


**Extent Report path** :  ```target/extent-output/ExtentReport.html```
[Extent Report](target/extent-output/ExtentReport.html)

**Cucumber Report path:**  ```target/cucumber-report/cucumber-output.html```
[Cucumber Report](target/cucumber-report/cucumber-output.html)

***To Gerarate Allure Report***

*1. Run the test using above any command*

*2. Check whether allure-results folders is available inside the target Folder*

*3. Generate the report using below command :*

```bash
mvn allure:report 
```

**allure Report path:**  ```target/site/allure-maven-plugin/index.html```
[Allure Report](target/site/allure-maven-plugin/index.html)



## Author

- [@asamaranayake](https://www.github.com/asamaranayake)
