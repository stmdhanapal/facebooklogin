$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "user login to the facebook",
  "description": "",
  "id": "user-login-to-the-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user login to face book",
  "description": "",
  "id": "user-login-to-the-facebook;user-login-to-face-book",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "lanch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user gives  email \"dhanapal165@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gives lastname \"thimmarayan\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.lanch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 19192305263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dhanapal165@gmail.com",
      "offset": 19
    }
  ],
  "location": "Step.user_gives_email(String)"
});
formatter.result({
  "duration": 4796746030,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thimmarayan",
      "offset": 21
    }
  ],
  "location": "Step.user_gives_lastname(String)"
});
formatter.result({
  "duration": 267350367,
  "status": "passed"
});
});