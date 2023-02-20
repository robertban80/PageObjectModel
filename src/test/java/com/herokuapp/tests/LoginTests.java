package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LoginTests extends BaseTest {
    @Parameters({"user", "pass", "mesajLogin"})
    @Test
    public void positiveLogin(String username, String password, String mesaj) {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver); //cream un obiect nou pentru pagina de login
//        loginPage.enterUserName("tomsmith");
//        loginPage.enterPassword("SuperSecretPassword!");
//        loginPage.clickLoginButton();
//sau folosind o metoda parametrizata...
        loginPage.loginWithUsernameAndPassword(username, password);


        SecurePage securePage = new SecurePage(driver); //cream un obiect nou pentru pagina de Success dupa login
        Assert.assertTrue(securePage.alertSuccessIsDisplayed());
        Assert.assertTrue(securePage.getAlertMessageText().contains(mesaj));


    }


}
