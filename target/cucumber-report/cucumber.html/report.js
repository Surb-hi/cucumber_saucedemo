$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2686859200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"mummy_pig1\", lastName \"papa_pig1\" and zipPostalCode \"380000\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "purchase.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 67210100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "purchase.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 120356300,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iClickOnLoginButton()"
});
formatter.result({
  "duration": 61599900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "purchase.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 5119196800,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 40123757200,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iOpenShoppingCart()"
});
formatter.result({
  "duration": 58970900,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iGoToCheckout()"
});
formatter.result({
  "duration": 47402600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mummy_pig1",
      "offset": 27
    },
    {
      "val": "papa_pig1",
      "offset": 50
    },
    {
      "val": "380000",
      "offset": 80
    }
  ],
  "location": "purchase.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 198221500,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iClickOnContinueButton()"
});
formatter.result({
  "duration": 20082819600,
  "status": "passed"
});
formatter.match({
  "location": "purchase.iClickOnFinishButton()"
});
formatter.result({
  "duration": 48075200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "purchase.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 30537700,
  "status": "passed"
});
formatter.after({
  "duration": 652140200,
  "status": "passed"
});
});