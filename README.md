# Cucumber Framework for Demo-nopcommerce Website

This project utilizes the Cucumber framework to test the Demo-nopcommerce website, focusing on the Login module and Add New Customer module. The purpose is to verify their responses against the expected output using Behavior Driven Development (BDD) Cucumber pattern.

## Project Structure

The project follows a structured organization to facilitate readability and maintainability:

- **Feature Folder**: Contains `.feature` files such as `Login.feature` and `Customer.feature`, where test scenarios are defined in a human-readable format using Gherkin syntax.
- **PageObject Folder**: Houses the Page Object Model classes (`LoginPage` and `Customer`) responsible for abstracting web elements and their interactions on the tested web pages.
- **StepDefinition Folder**: Contains the Step Definition classes, such as `StepDef`, where the steps defined in the `.feature` files are implemented.
- **Runner Folder**: Hosts the Runner Class, where Cucumber options are declared. This class specifies the location of feature files and Step Definition classes using the `@CucumberOptions` annotation.

## Technology Stack

The project is built using the following technologies:

- **Java**: The primary programming language for writing test scripts.
- **Maven**: Dependency management and build automation tool.
- **TestNG**: Testing framework for organizing and executing test cases.
- **Selenium**: WebDriver library used for browser automation.
- **Cucumber**: BDD framework for writing human-readable test scenarios.

## Framework Design

The framework design pattern employed in this project is the Page Object Model (POM). POM enhances test script maintainability by separating the abstraction of web elements and their interactions from the test scripts themselves.

## Setup and Usage

1. Clone this repository to your local machine.
2. Ensure you have Java, Maven, and necessary dependencies installed.
3. Navigate to the project directory.
4. Run the tests using your preferred IDE or command-line interface.

## How to Contribute

Contributions to this project are welcome! If you have any suggestions, feature requests, or would like to report a bug, please open an issue or submit a pull request.

## License


