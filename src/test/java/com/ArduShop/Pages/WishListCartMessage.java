package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListCartMessage extends BasePage {
    @FindBy(xpath = " //*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div[2]/div/a")
    WebElement wishList;
    @FindBy(xpath = "//*[@id=\"search\"]/div[3]/div/div/div/div/p")
    WebElement wishListDisplayed;

    @FindBy(xpath = "//*[@id=\"search\"]/div[3]/div/div/a")
    WebElement closeMessage;


    public WishListCartMessage(WebDriver driver) {
        super(driver);
    }
    public void wishListButton(){
        wishList.click();
    }
    public boolean wishListMessageIsDisplayed(){
       return wishListDisplayed.getText().contains("Produsul a fost adăugat în lista dumneavoastră de produse dorite.");
    }
    public void closeButton(){
        closeMessage.click();

    }

}