package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends Utility {
    private static final Logger log = LogManager.getLogger(PurchasePage.class.getName());

    public PurchasePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement list;


    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addchipestproduct;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addcostliestproduct;

    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement shoppingCart;

    public void ClickOnList() {
        clickOnElement(list);
        log.info("Clicking on list" + list.toString() + "<br>");
    }
    public void selectProductHighToLow(String hightolowtext) {
        selectByVisibleTextFromDropDown(list,hightolowtext);
        log.info("Selecting product high to low" + hightolowtext + " from dropdown " + list.toString() + "<br>");
    }

    public void ClickOnCostliestProductAddToCart() {
        clickOnElement(addcostliestproduct);
        log.info("Clicking on costliest product" + addcostliestproduct.toString() + "<br>");
    }
    public void ClickOnChipestproductAddToCart() {
        clickOnElement(addchipestproduct);
        log.info("Clicking on chipest product" + addchipestproduct.toString() + "<br>");
    }
    public void ClickOnShoppingCart() {
        clickOnElement(shoppingCart);
        log.info("Clicking on ShoppingCart" + shoppingCart.toString() + "<br>");
    }
}
