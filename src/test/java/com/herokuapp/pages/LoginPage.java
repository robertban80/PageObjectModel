package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {  //LoginPage mosteneste pe BasePage
    public final static String LOGIN_URL = BASE_URL + "login";
    @FindBy (id="username") private WebElement usernameInput; //identificator pentru username
    @FindBy (id="password") private WebElement passwordInput; //identificator pentru parola
    @FindBy (css=".fa-sign-in") private WebElement loginButtonInput;
    @FindBy (id="flash") private WebElement alertLogout; //trebuie pentu confirmarea logout-ului

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String username){
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        //WebElement loginButton = driver.findElement(By.className("radius"));
        loginButtonInput.click();
    }

    public void loginWithUsernameAndPassword(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        clickLoginButton();
    }

    public boolean checkIfLogoutAlertIsDisplayed(){
        return alertLogout.isDisplayed();
    }

    public String getAlertMessageText(){
        return alertLogout.getText();
    }

}
