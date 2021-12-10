package br.com.sissonline.pages;

import br.com.sissonline.maps.PrincipalSissMap;
import br.com.sissonline.maps.SelecionaUnidadeMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionarUnidadePage {
    private WebDriver driver;
    private SelecionaUnidadeMap selecionaUnidadeMap;

    public SelecionarUnidadePage(WebDriver driver) {
        this.driver = driver;
        selecionaUnidadeMap = new SelecionaUnidadeMap();
    }

    public void inpUnidade(){
        String ubsUnidade = "UBS PONTE GRANDE ADMINISTRADOR";
        String xpathUnidade = "//*[@id=\"_div\"]/input";
        WebElement unidade = driver.findElement(By.xpath(xpathUnidade));
        unidade.sendKeys(ubsUnidade);

        String xpathUnidadeEscolhida = "//*[@id=4096]/div/div[2]";
        WebElement unidadeEscolhida = driver.findElement(By.xpath(xpathUnidadeEscolhida));
        unidadeEscolhida.click();

    }
}
