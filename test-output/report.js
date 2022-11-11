$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Adding New Customers in Customers Section",
  "description": "",
  "id": "adding-new-customers-in-customers-section",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To add customer in customers menu",
  "description": "",
  "id": "adding-new-customers-in-customers-section;to-add-customer-in-customers-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Customer Menu in the left navigation bar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Clicks on customer menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on AddNewButton",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on DashboardMenu Option",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_launches_chrome_browser()"
});
formatter.result({
  "duration": 6309118300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F",
      "offset": 20
    }
  ],
  "location": "Stepdefination.user_enter_the_url(String)"
});
formatter.result({
  "duration": 8020476700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 25
    },
    {
      "val": "admin",
      "offset": 63
    }
  ],
  "location": "Stepdefination.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 3854353500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7081122400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_Customer_Menu_in_the_left_navigation_bar()"
});
formatter.result({
  "duration": 164634100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.clicks_on_customer_menu()"
});
formatter.result({
  "duration": 2390337700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_AddNewButton()"
});
formatter.result({
  "duration": 2748921600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_click_on_DashboardMenu_Option()"
});
formatter.result({
  "duration": 2126962600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.close_browser()"
});
formatter.result({
  "duration": 595763000,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "To Test the login Functionality of Application",
  "description": "",
  "id": "to-test-the-login-functionality-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checking with valid credentials",
  "description": "",
  "id": "to-test-the-login-functionality-of-application;checking-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username as \"admin@yourstore.com123\" and password as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_launches_chrome_browser()"
});
formatter.result({
  "duration": 3833349800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F",
      "offset": 20
    }
  ],
  "location": "Stepdefination.user_enter_the_url(String)"
});
formatter.result({
  "duration": 9753223200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com123",
      "offset": 25
    },
    {
      "val": "admin",
      "offset": 66
    }
  ],
  "location": "Stepdefination.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 3866122300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2320905700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.close_browser()"
});
formatter.result({
  "duration": 550358200,
  "status": "passed"
});
});