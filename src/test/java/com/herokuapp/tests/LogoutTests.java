package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LogoutTests extends BaseTest {
    @Parameters({"user", "pass", "successLogoutMessage"})
    @Test(priority = 1)
    public void loginAndLogout(String username, String password, String successLogout) {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver); //cream un obiect nou pentru pagina de login
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
//        SecurePage securePage = new SecurePage(driver); //cream un obiect nou pentru pagina de Success dupa login
//        securePage.clickLogoutButton();
//        Assert.assertTrue(loginPage.checkIfLogoutAlertIsDisplayed());
//         Assert.assertTrue(loginPage.getAlertMessageText().contains("You logged out of the secure area!"));

    }

    @Test(priority = 2)
    public void logout() {
        LoginPage loginPage = new LoginPage(driver); //cream un obiect nou pentru pagina de login
        SecurePage securePage = new SecurePage(driver); //cream un obiect nou pentru pagina de Success dupa login
        securePage.clickLogoutButton();
        Assert.assertTrue(loginPage.checkIfLogoutAlertIsDisplayed());
    }
}

