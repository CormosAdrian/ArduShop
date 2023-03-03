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
        webForm.loginSerch();
        webForm.EmailField();
        webForm.passwordField();
        webForm.loginSubmit();
    }
    public static void NavigateToSecondPage()  {
        SelectProduct webSelectProduct=new SelectProduct(driver);
        waitFor(500);
        webSelectProduct.searchProduct("Ramps 1.5");
        webSelectProduct. sortareAscendent();
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
        WishListCartMessage webForm=new WishListCartMessage(driver);
        webForm.wishListButton();
        waitFor(500);
        webForm.closeButton();
    }


    @AfterMethod
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
