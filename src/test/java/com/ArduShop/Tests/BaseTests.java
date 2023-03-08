package com.ArduShop.Tests;

import com.ArduShop.Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected static WebDriver driver;

    public static void waitFor(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @BeforeMethod
    protected void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    }
    public static void NavigateToFirstPage() {

        driver.get(BasePage.BASE_URL);
        LoginAndSerchPage webForm = new LoginAndSerchPage(driver);
        waitFor(4000);
        webForm.loginSerch();
        waitFor(4000);
        webForm.EmailField();
        webForm.passwordField();
        waitFor(4000);
        webForm.loginSubmit();
        waitFor(4000);
    }
    public static void NavigateToSecondPage()  {
        SelectProduct webSelectProduct=new SelectProduct(driver);
        waitFor(4000);
        webSelectProduct.searchProduct("Ramps 1.5");
        waitFor(4000);
        webSelectProduct. sortareAscendent();
        waitFor(4000);
    }
    public static void NavigateToThirdPage()  {
        ShopProduct webShopProduct=new ShopProduct(driver);
        waitFor(500);
        webShopProduct.addToCart();
        waitFor(5000);
        webShopProduct.proceedToCheckout();
    }

    public static void WishListCartPage()   {
        NavigateToFirstPage();
        NavigateToSecondPage();
        WishListCartMessage webWishCart=new WishListCartMessage(driver);
        webWishCart.wishListButton();
        waitFor(500);
        webWishCart.closeButton();
    }

    @AfterMethod
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
