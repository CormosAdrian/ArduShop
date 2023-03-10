package com.ArduShop.Tests;

import com.ArduShop.Pages.WishListCheck;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WishListCartTest extends BaseTests{

    @Test(testName = "Check the wish list")
    public static void CheckTheWishList()  {
        driver = new ChromeDriver();
        WishListCheck wishListCheck=new WishListCheck(driver);
        WishListCartPage();
        wishListCheck.submitContClient();
        wishListCheck.submitWishList();
        waitFor(2000);
        Assert.assertTrue(wishListCheck.checkWishList(),"Produsul nu a fost adaugat in lista de dorinte!");
    }
}
