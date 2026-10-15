
# Web UI Automation Framework

## Description

This project is a web UI automation testing framework developed
using Java, Gradle, Selenium WebDriver, Cucumber, and JUnit.

The framework is used to test the login functionality of
the SauceDemo website.

Website: https://www.saucedemo.com/

## Technologies Used

- Java
- Gradle
- Selenium WebDriver
- Cucumber
- Gherkin
- JUnit 4
- Google Chrome

## Project Structure

```text
WebUIAutomationFramework/
├── build.gradle
├── settings.gradle
├── src/
│   └── test/
│       ├── java/
│       │   ├── page/
│       │   │   └── LoginPage.java
│       │   ├── steps/
│       │   │   └── LoginSteps.java
│       │   └── runners/
│       │       └── TestRunner.java
│       └── resources/
│           └── features/
│               └── login.feature
└── reports/
    ├── cucumber-report.html
    └── cucumber-report.json
```

## Test Scenarios

The framework includes the following test scenarios:

1. Login with valid username and password.
2. Login with an invalid password.
3. Login with an empty username.
4. Login with a very long username.

## How to Run the Tests

1. Open the project in IntelliJ IDEA.
2. Make sure the required Gradle dependencies are available.
3. Open `TestRunner.java`.
4. Right-click the file and select Run.

The tests will run in the Chrome browser.

## Test Reports

Cucumber generates HTML and JSON test reports.

- HTML report: `reports/cucumber-report.html`
- JSON report: `reports/cucumber-report.json`

Open the HTML report in a web browser to review
the test execution results.

## Page Object Model

The framework uses the Page Object Model (POM)
to separate page interactions from test steps.

- `LoginPage.java`: Handles login page interactions.
- `LoginSteps.java`: Connects Gherkin steps to Java methods.
- `TestRunner.java`: Configures and runs Cucumber tests.
