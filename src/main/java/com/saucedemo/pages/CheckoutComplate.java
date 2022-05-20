package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutComplate extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutComplate.class.getName());

    public CheckoutComplate() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement message;

    public String VerifyMessageTeaxt() {
        log.info("getting  text from THANK YOU FOR YOUR ORDER "+message.toString()+"<br>");
        return getTextFromElement(message);
    }
}
