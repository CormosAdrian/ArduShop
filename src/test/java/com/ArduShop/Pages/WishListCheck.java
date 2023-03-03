package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListCheck extends BasePage {
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[4]/a/span")
    WebElement contClient;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li[2]/a/span")
    WebElement wishListButton;
    //@FindBy(xpath ="//*[@id=\"wishlist_4831\"]/td[1]/a")
    @FindBy(xpath = "//*[@id=\"block-history\"]/table/thead/tr/th[1]")
    //@FindBy(xpath = "//*[@id=\"wishlist_4840\"]/td[1]/a")
            WebElement checkList;









    public WishListCheck(WebDriver driver) {
        super(driver);
    }

    public void submitContClient(){
        contClient.click();
    }
    public void submitWishList(){
        wishListButton.click();
    }
    public boolean checkWishList(){
        return checkList.isDisplayed();
    }

}
