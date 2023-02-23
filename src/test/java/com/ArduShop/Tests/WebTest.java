package com.ArduShop.Tests;

import com.ArduShop.Pages.SecurePage;
import com.ArduShop.Pages.WebForm;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.ArduShop.Pages.WebForm.LOGIN_URL;

public class WebTest extends BaseTest{

    @Test (priority = 1)

    public void webFunction()throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        WebForm webForm = new WebForm(driver);
        SecurePage securePage = new SecurePage(driver);
        Assert.assertTrue(securePage.verificaLogo(), "Lipsa Logo");
        Assert.assertTrue(securePage.verificaTitlu(), "Lipsa Titlu");


        webForm.introduInBara();
        Thread.sleep(500);

        Assert.assertTrue(securePage.rezultatCautareIsDisplayed(), "Lipsa Produs");
        Assert.assertTrue(securePage.verificareStock(), "Lipsa Stoc");
        webForm.sortareDupa1();
        Thread.sleep(500);


        webForm.adaugareIncos();
        Thread.sleep(500);
        webForm.comandaFinalizata();

        Assert.assertTrue(securePage.confirmProdusInCos(), "Produsul nu a fost adaugat in cos!");

        Assert.assertTrue(securePage.verificareProduseDinCos().contains("1"),"0 Produse in cos sau mai mult de 1 produs");
        webForm.stergeProdus();
        Thread.sleep(500);
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        Assert.assertTrue(securePage.afisareCosGol().contains("Cosul tau este gol."),"Cosul de cumparaturi nu este gol");
        webForm.goFirstPage();
        webForm.mesajFinal();


    }
}
