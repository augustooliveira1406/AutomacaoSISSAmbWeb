package br.com.sissonline.automacaoWeb;

import br.com.sissonline.core.Driver;
import br.com.sissonline.enums.Browser;
import br.com.sissonline.pages.MenuPrincipalPage;
import br.com.sissonline.pages.PrincipalSissPage;
import br.com.sissonline.pages.SelecionarUnidadePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlteraBaseAmbiente {
    Driver driverWeb;
    WebDriver driver;
    PrincipalSissPage principalSissPage;

    @Test
    public void inicializaTeste(){
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("http://qualidade.manutencao.sissonline.com.br/configuration");
        principalSissPage = new PrincipalSissPage(driver);

        String base = "SaudeGuarulhosSup";
        driver.findElement(By.id("txtInitialCatalog")).clear();
        WebElement mudarBase = driver.findElement(By.id("txtInitialCatalog"));
        mudarBase.sendKeys(base);
        principalSissPage.getBtnSalvar();
        principalSissPage.getBtnInicial();
    }
}
