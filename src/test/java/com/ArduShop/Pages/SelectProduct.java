package com.ArduShop.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectProduct extends BasePage {
    private final String PRODUCT = "Ramps 1.5";

    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(xpath = "(//select[@id='selectProductSort'])[1]")
    public WebElement sortare1;

    public SelectProduct(WebDriver driver) {
        super(driver);
    }


    public void searchProduct(String search) {
        searchBar.sendKeys(search);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void sortareAscendent() {
        Select selectSortare = new Select(sortare1);
        selectSortare.selectByValue("reference:asc");
    }
}