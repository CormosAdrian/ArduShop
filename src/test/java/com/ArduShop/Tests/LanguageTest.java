package com.ArduShop.Tests;


import com.ArduShop.Pages.SelectLanguage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.BasePage.BASE_URL;


public class LanguageTest extends BaseTests {


    @Test(testName = "Language")
    public static void CheckLanguage()   {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        SelectLanguage selectLanguage=new SelectLanguage(driver);
        selectLanguage.languageButton();
        selectLanguage.EnglishLanguage();
        waitFor(500);
        Assert.assertTrue(selectLanguage.EnglishOrRomanianMenu("Featured products"),"Meniul nu este in limba Engleza!");
        waitFor(500);
        selectLanguage.languageButton();
        waitFor(500);
        selectLanguage.RoumanianLanguage();
        Assert.assertTrue(selectLanguage.EnglishOrRomanianMenu("Cele mai cautate"),"Meniul nu este in limba Romana!");
    }
}
