package br.com.sissonline.pages;

import br.com.sissonline.maps.PrincipalSissMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalSissPage {
    private WebDriver driver;
    private PrincipalSissMap principalSissMap;

    public PrincipalSissPage(WebDriver driver) {
        this.driver = driver;
        principalSissMap = new PrincipalSissMap();
    }
    public void getBtnEntrar() {
        String xpathBotao = "//*[@id=\"btEntrar\"]";
        WebElement btnEntrar = driver.findElement(By.xpath(xpathBotao));
        btnEntrar.click(); //clicando no botão
    }
    
    public void getBtnSalvar(){
        String xpathBotao = "//*[@id=\"btnSaveDatabaseSettings\"]";
        WebElement btnEntrar = driver.findElement(By.xpath(xpathBotao));
        btnEntrar.click(); //clicando no botão
    }

    public void getBtnInicial(){
        String xpathBotao = "//*[@id=\"divConfiguration\"]/div[2]/fieldset[1]/a";
        WebElement btnInicial = driver.findElement(By.xpath(xpathBotao));
        btnInicial.click(); //clicando no botão
    }


}
