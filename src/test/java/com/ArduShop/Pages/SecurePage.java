package com.ArduShop.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class SecurePage extends BasePage {
    @FindBy(css = "#header_logo")
    private WebElement logo;
    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    private WebElement titlu;

    @FindBy(id = "center_column")
    WebElement verificaRezultat;
    @FindBy(css="#center_column > h1 > span.heading-counter")
    WebElement stoc;
    @FindBy(id = "summary_products_quantity")
    public WebElement sumarCos;
    //@FindBy(xpath = "//*[@id=\"summary_products_quantity\"]")
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]")
    public WebElement numarProduse;


    @FindBy(id = "emptyCartWarning")
    public WebElement zeroProduse;
    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    public WebElement rezultatFinal;

    public SecurePage(WebDriver driver) {
        super(driver);

    }
    public boolean verificaLogo(){
        return logo.isDisplayed();
    }
    public boolean verificaTitlu() {
       return titlu.isDisplayed();
    }

    public boolean rezultatCautareIsDisplayed() {

        return verificaRezultat.getText().contains("au fost gasite");
    }


    public boolean verificareStock(){
        return stoc.isDisplayed();

    }
    public boolean confirmProdusInCos(){
        return sumarCos.isDisplayed();
    }

   public String verificareProduseDinCos (){
       return numarProduse.getText();
    }
    public String afisareCosGol() {
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return zeroProduse.getText();
    }
    //public boolean

}
