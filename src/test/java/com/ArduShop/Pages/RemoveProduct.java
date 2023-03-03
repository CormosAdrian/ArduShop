package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProduct extends BasePage{
    @FindBy(xpath = "//*[@id=\"845_0_0_60564\"]/i")
    WebElement deleteButton;
    @FindBy(id = "emptyCartWarning")
    WebElement emptyCartAlert;
    @FindBy(xpath = "//*[@id=\"columns\"]/div[1]/a/i")
    WebElement homeButtton;


    public RemoveProduct(WebDriver driver) {
        super(driver);
    }
    public void clickDeleteButton(){
        deleteButton.click();
    }
    public boolean emptyCart(){
        return emptyCartAlert.getText().contains("Cosul tau este gol.");
    }
    public void returnToHomePage(){
        homeButtton.click();
    }

}
