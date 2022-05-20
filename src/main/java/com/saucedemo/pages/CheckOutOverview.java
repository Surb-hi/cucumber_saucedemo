package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverview extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutOverview.class.getName());

    public CheckOutOverview() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish;

    public void ClickOnFinish(){
        log.info("Clicking on finish"+ finish.toString()+ "<br>");
        clickOnElement(finish);
    }
}
