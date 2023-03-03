package com.ArduShop.Tests;

import com.ArduShop.Pages.WishListCheck;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class WishListCartTest extends BaseTests{

    @Test(testName = "Check the wish list")
    public static void CheckTheWishList()  {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        WishListCheck webForm=new WishListCheck(driver);
        WishListCartPage();
        webForm.submitContClient();
        webForm.submitWishList();
        waitFor(2000);
        Assert.assertTrue(webForm.checkWishList(),"Produsul nu a fost adaugat in lista de dorinte!");
    }
}
