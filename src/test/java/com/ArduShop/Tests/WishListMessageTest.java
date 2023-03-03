package com.ArduShop.Tests;

import com.ArduShop.Pages.WishListCartMessage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class WishListMessageTest extends BaseTests {

    @Test(testName = "Wish List message")
    public static void MessageWishList() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        WishListCartMessage webForm=new WishListCartMessage(driver);
        NavigateToFirstPage();
        NavigateToSecondPage();
        webForm.wishListButton();
        waitFor(1000);
        Assert.assertTrue(webForm.wishListMessageIsDisplayed(),"Mesajul nu a fost afisat!");
        webForm.closeButton();
    }
}
