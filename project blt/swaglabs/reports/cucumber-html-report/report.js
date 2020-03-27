$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/swaglabs.feature");
formatter.feature({
  "line": 1,
  "name": "Test swaglabs",
  "description": "",
  "id": "test-swaglabs",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Test whether the user is able to click the about and naviagate to required page",
  "description": "",
  "id": "test-swaglabs;test-whether-the-user-is-able-to-click-the-about-and-naviagate-to-required-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@TC03_Swaglabs"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user should login with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user should click the about by clicking on the home button and navigate to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "select anyone field in the about page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "close the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});