package com.ArduShop.Tests;

import com.ArduShop.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
       System.setProperty("webdriver.http.factory", "jdk-http-client");



    }
    public static void NavigateToFirstPage() {
      ChromeOptions option = new ChromeOptions();



        driver.get(BasePage.BASE_URL);
        LoginAndSerchPage webForm = new LoginAndSerchPage(driver);
        waitFor(2000);
        webForm.loginSerch();
        waitFor(2000);
        webForm.EmailField();
        webForm.passwordField();
        waitFor(2000);
        webForm.loginSubmit();
        waitFor(2000);
    }
    public static void NavigateToSecondPage()  {

        SelectProduct webSelectProduct=new SelectProduct(driver);
        waitFor(1000);
        webSelectProduct.searchProduct("Ramps 1.5");
        waitFor(1000);
        webSelectProduct. sortareAscendent();

    }
    public static void NavigateToThirdPage()  {
        ShopProduct webShopProduct=new ShopProduct(driver);
        waitFor(4000);

        webShopProduct.addToCart();
        waitFor(2000);
        webShopProduct.proceedToCheckout();
    }

    public static void WishListCartPage()   {
        NavigateToFirstPage();
        NavigateToSecondPage();
        WishListCartMessage webWishCart=new WishListCartMessage(driver);
        webWishCart.wishListButton();
        waitFor(1000);
        webWishCart.closeButton();
    }

    @AfterMethod
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
