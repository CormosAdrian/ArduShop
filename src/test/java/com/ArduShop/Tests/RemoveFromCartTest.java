package com.ArduShop.Tests;

import com.ArduShop.Pages.RemoveProduct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ArduShop.Pages.LoginAndSerchPage.LOGIN_URL;

public class RemoveFromCartTest extends BaseTests{
    @Test(testName = "Remove from cart")
    public static void DeleteProductFromMyCart() {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);

        NavigateToFirstPage();
        NavigateToSecondPage();
        NavigateToThirdPage();
        RemoveProduct webForm=new RemoveProduct(driver);
        webForm.clickDeleteButton();
        waitFor(2000);
        Assert.assertTrue(webForm.emptyCart(),"Nu sa reusit stergerea produsului din cos!");
        webForm.returnToHomePage();
    }
}
