Feature: Login

  Scenario: Successful Login with valid credentials
    Given  User Launch Chrome Browser
    When  User open URL "https://admin-demo.nopcommerce.com/login"
    And   User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click Login button
    Then Page Tittle should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Tittle should be "Your store. Login"
    And close browser


  Scenario Outline: Successful Login with valid DDT
    Given  User Launch Chrome Browser
    When  User open URL "https://admin-demo.nopcommerce.com/login"
    And   User enter Email as "<email>" and Password as "<password>"
    And Click Login button
    Then Page Tittle should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Tittle should be "Your store. Login"
    And close browser
    Examples:
      | email               | password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  |admin     |

