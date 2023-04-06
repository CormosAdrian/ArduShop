package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopProduct extends BasePage{



    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
   public WebElement adaugaInCos;

    @FindBy(xpath = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[5]/a/span")

    public WebElement finalComanda;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]")
    public WebElement numarProduse;




    public ShopProduct (WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        adaugaInCos.click();
    }
    public void  proceedToCheckout(){
        finalComanda.click();
    }
    public boolean checkTheCart(){
        return numarProduse.isDisplayed();
    }






}




