package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class SecurePage extends BasePage {
    @FindBy(id = "flash")
    WebElement alertSuccess;
    @FindBy(css = ".icon-signout")
    WebElement logoutButton;

    public SecurePage(WebDriver driver) {
        super(driver); //prin super folosim parametrul din clasa parinte!!!
    }

    public boolean alertSuccessIsDisplayed() {
        return alertSuccess.isDisplayed();
    }

    public String getAlertMessageText() {
        return alertSuccess.getText();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

}
