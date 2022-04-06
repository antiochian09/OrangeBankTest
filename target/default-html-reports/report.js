$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/googleSearch.feature");
formatter.feature({
  "name": "Search Orange Bank on Google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Orange Bank and verify number of results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@myTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the \"https://www.google.es\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.OrangeBank.StepDefinitions.MyStepDefs.userOpenThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type \"Orange Bank\" in the search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.OrangeBank.StepDefinitions.MyStepDefs.userTypeInTheSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify number of results is more than 100000 and is not less than 10000",
  "keyword": "And "
});
formatter.match({
  "location": "com.OrangeBank.StepDefinitions.MyStepDefs.verifyNumberOfResultsIsMoreThan(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});