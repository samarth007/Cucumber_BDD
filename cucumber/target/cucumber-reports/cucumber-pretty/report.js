$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the login credantial",
  "description": "",
  "id": "login;verify-the-login-credantial",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Users enter the Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the creadtinal",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.users_enter_the_Website()"
});
formatter.result({
  "duration": 10034306600,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_enters_the_creadtinal()"
});
formatter.result({
  "duration": 2432442900,
  "status": "passed"
});
formatter.match({
  "location": "Step.homepage_is_displayed()"
});
formatter.result({
  "duration": 30096600,
  "status": "passed"
});
});