package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class purchase {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new LogInPage().setTextUsername(username);
        new LogInPage().setTextPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LogInPage().ClickOnLogin();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String product) throws InterruptedException {
        new PurchasePage().ClickOnList();
        Thread.sleep(5000);
        new PurchasePage().selectProductHighToLow(product);
    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new PurchasePage().ClickOnChipestproductAddToCart();
        new PurchasePage().ClickOnCostliestProductAddToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new PurchasePage().ClickOnShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShoppingCartPage().ClickOnCheckOut();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipcode) {
        new CheckOutYourInformatiom().setTextFirstname(firstname);
        new CheckOutYourInformatiom().setTextLastname(lastname);
        new CheckOutYourInformatiom().setTextZipCode(zipcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutYourInformatiom().ClickOnContinue();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutOverview().ClickOnFinish();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String message) {
        Assert.assertEquals("", message, new CheckoutComplate().VerifyMessageTeaxt());
    }
}
