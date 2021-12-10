package br.com.sissonline.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalSissMap {
    @FindBy(xpath = "//*[@id=\"btEntrar\"]")
    public WebElement btnEntrar;

    @FindBy(xpath ="//*[@id=\"btnSaveDatabaseSettings\"]")
    public WebElement btnSalvar;

    @FindBy(xpath = "//*[@id=\"divConfiguration\"]/div[2]/fieldset[1]/a")
    public WebElement btnInicial;
}


