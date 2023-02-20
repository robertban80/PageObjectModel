package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.CheckboxPage.CHECKBOX_URL;
public class CheckboxTests extends BaseTest{
    @Test
    public void checkCheckbox() {
        driver = new ChromeDriver();
        driver.get(CHECKBOX_URL);
        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.checkTheSecondCheckbox();
        checkboxPage.checkTheFirstCheckbox();
        Assert.assertTrue(checkboxPage.checkIfChecked_ambele_sunt_bifate());

    }


}
