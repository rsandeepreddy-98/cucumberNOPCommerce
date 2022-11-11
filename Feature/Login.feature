Feature: To Test the login Functionality of Application

  Scenario: Checking with valid credentials
    Given user launches chrome browser
    When user enter the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enters username as "admin@yourstore.com123" and password as "admin"
    And user clicks on login button
    Then close browser

   