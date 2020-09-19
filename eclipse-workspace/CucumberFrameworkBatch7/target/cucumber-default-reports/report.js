$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Dashboard.feature");
formatter.feature({
  "name": "Dashboard Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dashboard tab verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dash"
    }
  ]
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the following dashboard tabs",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});