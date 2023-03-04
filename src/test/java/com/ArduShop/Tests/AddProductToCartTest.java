package com.ArduShop.Tests;

import com.ArduShop.Pages.ShopProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.BasePage.BASE_URL;


public class AddProductToCartTest extends BaseTests{

    @Test(testName = "Add to cart")
    public static void AddProductToCart()  {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        NavigateToFirstPage();
        NavigateToSecondPage();
        ShopProduct shopProduct=new ShopProduct(driver);
        waitFor(1000);
        shopProduct.addToCart();
        waitFor(5000);
        shopProduct.proceedToCheckout();
        Assert.assertTrue(shopProduct.checkTheCart(),"Produsul a fost adaugat in cos!");
    }
}
