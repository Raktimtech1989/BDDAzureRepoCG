$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/eCommerce/AddToCart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "  To validate products are added in the cart",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@cs_cart"
    },
    {
      "name": "@cs_cart_add_to_cart"
    }
  ]
});
formatter.scenario({
  "name": "Add to cart single product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cs_cart"
    },
    {
      "name": "@cs_cart_add_to_cart"
    }
  ]
});
formatter.step({
  "name": "I enter valid details in top search box",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.i_enter_in_top_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.i_see_the_homepage()"
});
formatter.result({
  "status": "passed"
});
});