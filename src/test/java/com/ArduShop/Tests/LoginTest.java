package com.ArduShop.Tests;

import com.ArduShop.Pages.BasePage;
import com.ArduShop.Pages.LoginAndSerchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class LoginTest extends BaseTests{



    @Test(testName = "Login page")
    public static void LoginPage() {
        driver = new ChromeDriver();
       driver.get(LOGIN_URL);

        LoginAndSerchPage webForm = new LoginAndSerchPage(driver);
        webForm.loginSerch();
        webForm.EmailField();
        webForm.passwordField();
        webForm.loginSubmit();
        Assert.assertTrue(webForm.alertaLogin(), "Nu ai reusit sa te loghezi!");
    }
}


