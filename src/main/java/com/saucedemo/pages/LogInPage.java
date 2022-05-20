package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Utility {
    private static final Logger log = LogManager.getLogger(LogInPage.class.getName());

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement login;

    public void setTextUsername(String usernametext) {
        log.info("Enter username " + usernametext + " to  field " + username.toString() + "<br>");
        sendTextToElement(username, usernametext);
    }

    public void setTextPassword(String passwordtext) {
        sendTextToElement(password, passwordtext);
        log.info("Enter password" + passwordtext + " to  field " + password.toString() + "<br>");
    }

    public void ClickOnLogin() {
        log.info("Clicking on login " + login.toString() + "<br>");
        clickOnElement(login);
    }

}
