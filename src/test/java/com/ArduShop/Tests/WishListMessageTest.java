package com.ArduShop.Tests;

import com.ArduShop.Pages.WishListCartMessage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WishListMessageTest extends BaseTests {

    @Test(testName = "Wish List message")
    public static void MessageWishList()  {
        driver = new ChromeDriver();
        WishListCartMessage wishListCartMessage=new WishListCartMessage(driver);
        NavigateToFirstPage();
        NavigateToSecondPage();
        wishListCartMessage.wishListButton();
        waitFor(1000);
        Assert.assertTrue(wishListCartMessage.wishListMessageIsDisplayed(),"Mesajul nu a fost afisat!");
        wishListCartMessage.closeButton();
    }
}
