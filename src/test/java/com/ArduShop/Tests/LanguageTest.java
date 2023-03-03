package com.ArduShop.Tests;

import com.ArduShop.Pages.BasePage;
import com.ArduShop.Pages.LoginAndSerchPage;
import com.ArduShop.Pages.SelectLanguage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class LanguageTest extends BaseTests {


    @Test(testName = "Language")
    public static void CheckLanguage()   {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        SelectLanguage webForm=new SelectLanguage(driver);
        webForm.languageButton();
        webForm.EnglishLanguage();
        waitFor(500);
        Assert.assertTrue(webForm.EnglishOrRomanianMenu("Featured products"),"Meniul nu este in limba Engleza!");
        waitFor(500);
        webForm.languageButton();
        waitFor(500);
        webForm.RoumanianLanguage();
        Assert.assertTrue(webForm.EnglishOrRomanianMenu("Cele mai cautate"),"Meniul nu este in limba Romana!");

    }
}
