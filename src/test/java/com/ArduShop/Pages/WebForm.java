package com.ArduShop.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebForm extends BasePage{
    public final static String LOGIN_URL=BASE_URL1+"login";

    //public final String CAUTARE= "Ramps 1.5";

    @FindBy(id="search_query_top")
    public  WebElement serchBar;

    @FindBy(xpath = "(//select[@id='selectProductSort'])[1]")
    public WebElement sortare1;
    @FindBy (xpath = "(//span[contains(text(),'Adauga in cos')])[1]")
    public WebElement adaugaInCos;
    @FindBy(xpath = "(//span[contains(text(),'Finalizează comanda')])[1]")
    public WebElement finalComanda;
    @FindBy(xpath = "//*[@id=\"845_0_0_0\"]/i")
    public WebElement butonStergere;
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    public WebElement clickLogo;

    @FindBy(id="search_query_top")
    public  WebElement serchNewBar;



    public WebForm (WebDriver driver) {
        super(driver);
    }
    public void introduInBara(){
        serchBar.sendKeys("Ramps 1.5");
       serchBar.sendKeys(Keys.ENTER);

    }
    public void sortareDupa1(){
        //sortare1.sendKeys("r");
        Select selectSortare = new Select(sortare1);
        selectSortare.selectByValue("reference:asc");

    }
    public void adaugareIncos(){
        adaugaInCos.click();
    }
    public void comandaFinalizata(){
        finalComanda.click();
    }
    public void stergeProdus(){
        butonStergere.click();
    }
    public void goFirstPage(){
        clickLogo.click();
    }
    public void mesajFinal(){
        serchBar.sendKeys("Acesta a fost proiectul meu!");
        serchBar.sendKeys(Keys.ENTER);

    }

}
