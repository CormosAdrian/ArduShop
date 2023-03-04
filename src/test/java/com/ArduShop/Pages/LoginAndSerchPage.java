package com.ArduShop.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.kerberos.KerberosKey;

public class LoginAndSerchPage extends BasePage {

    private final String EMAIL = "cormos.adrian@yahoo.com";
    private final String PASSWORD = "RzF0/tI0";



    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[4]/a")
    private WebElement autentificare;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement alertaLogare;



    public LoginAndSerchPage(WebDriver driver) {
        super(driver);
    }

    public void loginSerch() {
        autentificare.click();
    }

    public void EmailField() {
        email.sendKeys(EMAIL);
    }
    public void passwordField(){
        password.sendKeys(PASSWORD);

    }
    public void loginSubmit(){
        loginButton.click();
    }

    public void login(){
        email.sendKeys(EMAIL);
        password.sendKeys(PASSWORD);
        loginButton.click();
    }

    public boolean alertaLogin() {
        return alertaLogare.getText().contains("Bine ai venit in cont.");
    }

}