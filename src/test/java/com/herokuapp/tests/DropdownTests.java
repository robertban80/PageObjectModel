package com.herokuapp.tests;


import com.herokuapp.pages.DropdownPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.DROPDOWN_URL;

public class DropdownTests extends BaseTest {

    @Test(testName = "Select Option 1")
    public void selectFirstOptionInDropdown() {
        driver = new ChromeDriver();
        driver.get(DROPDOWN_URL);

        DropdownPage dropdownPage = new DropdownPage(driver); //am construit obiectul dropdownpage ca sa pot apela toate metodele din clasa dropdownpage
        dropdownPage.selectFirstOption();
        //dropdownPage.selectOptions("Option 1");
        Assert.assertTrue(dropdownPage.checkThatFirstOptionIsSelected());

    }

    @Test(testName = "Select Option 2")
    public void selectSecondOptionInDropdown() {
        driver = new ChromeDriver();
        driver.get(DROPDOWN_URL);

        DropdownPage dropdownPage = new DropdownPage(driver); //am construit obiectul dropdownpage ca sa pot apela toate metodele din clasa dropdownpage
        dropdownPage.selectOptions("Option 2");
        Assert.assertTrue(dropdownPage.checkThatOptionIsSelected("Option 2"));

    }


}
