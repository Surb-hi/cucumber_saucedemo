package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;

    public void ClickOnCheckOut() {
        Reporter.log("Clicking on checkout" + checkout.toString() + "<br>");
        clickOnElement(checkout);
    }


}
