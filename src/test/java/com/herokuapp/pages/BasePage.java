//BasePage.java este pagina de baza a aplicatiei, de aici se deschid restul paginilor...
//contine URL-ul de baza!

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

public class BasePage {
    protected WebDriver driver;
    final static String BASE_URL = "https://the-internet.herokuapp.com/"; //cu final declaram constanta!

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        //PageFactory construieste cate o pagina pentru fiecare pagina web pe care vreu s-o testez
    }

}
