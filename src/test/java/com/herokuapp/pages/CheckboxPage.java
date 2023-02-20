package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxPage extends BasePage {
    public final static String CHECKBOX_URL = BASE_URL + "checkboxes";

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]") private WebElement checkbox2;
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]") private WebElement checkbox1;

    public void checkTheSecondCheckbox() {
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
    }

    public void checkTheFirstCheckbox() {
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
    }

    public boolean checkIfChecked_ambele_sunt_bifate(){
        return (checkbox2.isSelected() && checkbox1.isSelected());
    }
}
