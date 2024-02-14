
# Automated Web Testing with Java, Maven, Selenium, and POM Pattern

## Overview

This project automates web testing for a website using Java, Maven, Selenium, and follows the Page Object Model (POM) pattern. The testing is done on Oracle OpenJDK (version 21.0.1).

## Test Cases Covered

1. **Product Number Update:**
   - After adding an item, verifies that the product number at the right top of the website properly changes.

2. **Login Form:**
   - After entering valid information, ensures the user is redirected to the profile page.

3. **Invalid Login Credentials:**
   - After entering invalid credentials into the login form, checks for the appropriate validation message.

4. **Logout:**
   - After clicking on the "Log out" button, confirms the user is redirected to the login or registration (myacc) page.

5. **Reset Password Validation:**
   - After entering a valid email for password reset, checks for the proper validation message.

6. **Account Details Validation:**
   - After going to account details and leaving required fields blank, verifies proper validation messages.

7. **Remove Item from Cart:**
   - After adding an item to the basket, ensures the user can remove the item from the cart.

8. **Sort Options:**
   - Checks if all sort options are selectable.

9. **Price Change Verification:**
   - After changing the price from hovering, verifies that numbers are changing properly.

10. **High to Low Sorting:**
    - After selecting the High to Low filter option, checks if items are sorted in the correct order.

## Environment

- Java Version: Oracle OpenJDK 21.0.1
- Runtime Version: 17.0.9+7-b1000.46 amd64


## How to Run Tests

1. Clone the repository: `git clone [repository URL]`
2. Navigate to the project directory: `cd [project directory]`
3. Execute tests using Maven: `mvn test`

## Dependencies

selenium-java v4.16.1
webdrivermanager v5.6.3
testng v7.9.0
javafaker v1.0.2
allure-testng v2.25.0


## Author

- Dimitri Antia

