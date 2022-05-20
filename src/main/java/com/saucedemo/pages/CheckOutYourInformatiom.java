package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutYourInformatiom extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutYourInformatiom.class.getName());

    public CheckOutYourInformatiom() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipcode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continue1;


    public void setTextFirstname(String firstnametext) {
        sendTextToElement(firstname, firstnametext);
        log.info("Enter firstname " + firstnametext + " to  field " + firstname.toString() + "<br>");
    }

    public void setTextLastname(String lastnametext) {
        sendTextToElement(lastname, lastnametext);
        log.info("Enter  " + lastnametext + " to  field " + lastnametext.toString() + "<br>");
    }

    public void setTextZipCode(String zipcodetext) {
        sendTextToElement(zipcode, zipcodetext);
        log.info("Enter zipcode " + zipcodetext + " to  field " + zipcode.toString() + "<br>");
    }
    public void ClickOnContinue() {
        clickOnElement(continue1);
        log.info("Clicking on continue" + continue1.toString() + "<br>");
    }

}
