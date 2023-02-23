package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    final static String BASE_URL1="https://ardushop.ro/ro/";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}


