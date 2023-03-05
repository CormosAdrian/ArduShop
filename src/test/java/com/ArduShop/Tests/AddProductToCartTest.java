package com.ArduShop.Tests;

import com.ArduShop.Pages.ShopProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AddProductToCartTest extends BaseTests{

    @Test(testName = "Add to cart")
    public static void AddProductToCart()  {
        driver = new ChromeDriver();

        NavigateToFirstPage();
        NavigateToSecondPage();
        NavigateToThirdPage();
        ShopProduct shopProduct=new ShopProduct(driver);
        Assert.assertTrue(shopProduct.checkTheCart(),"Produsul a fost adaugat in cos!");
    }
}
