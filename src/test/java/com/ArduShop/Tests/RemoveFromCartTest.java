package com.ArduShop.Tests;

import com.ArduShop.Pages.RemoveProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RemoveFromCartTest extends BaseTests{
    @Test(testName = "Remove from cart")
    public static void DeleteProductFromMyCart() {
        driver = new ChromeDriver();

        NavigateToFirstPage();
        NavigateToSecondPage();
        NavigateToThirdPage();
        RemoveProduct removeProduct=new RemoveProduct(driver);
        removeProduct.clickDeleteButton();
        waitFor(2000);
        Assert.assertTrue(removeProduct.emptyCart(),"Nu sa reusit stergerea produsului din cos!");
        removeProduct.returnToHomePage();
    }
}
