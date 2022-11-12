$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/Login.feature");
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
  "duration": 17391343500,
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
  "duration": 8145304400,
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
  "duration": 4690027200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2301183000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.close_browser()"
});
formatter.result({
  "duration": 500698800,
  "status": "passed"
});
});