package com.ArduShop.Tests;

import com.ArduShop.Pages.ShopProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class AddProductToCartTest extends BaseTests{

    @Test(testName = "Add to cart")
    public static void AddProductToCart()  {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        NavigateToFirstPage();
        NavigateToSecondPage();
        ShopProduct webForm=new ShopProduct(driver);
        waitFor(1000);
        webForm.addToCart();
        waitFor(5000);
        webForm.proceedToCheckout();
        Assert.assertTrue(webForm.checkTheCart(),"Produsul a fost adaugat in cos!");
    }
}
