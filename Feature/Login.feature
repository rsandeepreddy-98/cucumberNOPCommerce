Feature: To Test the login Functionality of Application

  Scenario: Checking with valid credentials
    Given user launches chrome browser
    When user enter the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enters username as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
    And user should be able to see dashboard page and verify it
    Then close browser
    
    Scenario: Checking with Invalid credentials
    Given user launches chrome browser
    When user enter the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enters username as "yoursadmin@yourstore.com" and password as "adminstrator"
    And user clicks on login button
    And user should be able to see dashboard page and verify it
    Then close browser

   