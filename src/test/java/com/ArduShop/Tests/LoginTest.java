package com.ArduShop.Tests;


import com.ArduShop.Pages.LoginAndSerchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.ArduShop.Pages.BasePage.BASE_URL;


public class LoginTest extends BaseTests{



    @Test(testName = "Login page")
    public static void LoginPage() {
        driver = new ChromeDriver();
       driver.get(BASE_URL);

        LoginAndSerchPage loginAndSerchPage = new LoginAndSerchPage(driver);
        loginAndSerchPage.loginSerch();
        loginAndSerchPage.EmailField();
        loginAndSerchPage.passwordField();
        loginAndSerchPage.loginSubmit();
        Assert.assertTrue(loginAndSerchPage.alertaLogin(), "Nu ai reusit sa te loghezi!");
    }
}


