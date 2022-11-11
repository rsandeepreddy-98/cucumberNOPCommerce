Feature: Adding New Customers in Customers Section

  Scenario: To add customer in customers menu
    Given user launches chrome browser
    When user enter the url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enters username as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
    And user clicks on Customer Menu in the left navigation bar
    And Clicks on customer menu
    And user clicks on AddNewButton
    And user click on DashboardMenu Option
    Then close browser
