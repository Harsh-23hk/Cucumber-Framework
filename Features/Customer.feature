Feature: Customer

  Scenario: Add new customer
    Given User Launch Chrome Browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click Login button
    Then User can view Dashboard
    When User Click on the Customers Menu
    And Click on the Customers Item
    And Click on the Add new button
    Then User can view the Add new customer page
    When User enter customer info
    And Click on the save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser


