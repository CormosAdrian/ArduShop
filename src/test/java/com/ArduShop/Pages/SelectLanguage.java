package com.ArduShop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectLanguage extends BasePage {

    @FindBy(xpath = "//*[@id=\"languages-block-top\"]/div/span")
    WebElement ChoseLanguageButton;

    @FindBy(xpath = "//*[@id='first-languages']/li[1]/a/span")
    WebElement English;
    @FindBy(css = "#featured-products_block_center > h3")
    WebElement title;
    @FindBy(xpath= "//*[@id=\"first-languages\"]/li[2]/a/span")
    WebElement Romanian;


    public SelectLanguage(WebDriver driver) {
        super(driver);
    }
    public void languageButton(){
        ChoseLanguageButton.click();
    }
    public void EnglishLanguage(){
        English.click();
    }
    public boolean EnglishOrRomanianMenu(String titlu){
        return title.getText().contains(titlu);
    }
    public void RoumanianLanguage(){
        Romanian.click();
    }

}