package br.com.sissonline.automacaoWeb;

import br.com.sissonline.core.Driver;
import br.com.sissonline.enums.Browser;
import br.com.sissonline.pages.MenuPrincipalPage;
import br.com.sissonline.pages.PrincipalSissPage;
import br.com.sissonline.pages.SelecionarUnidadePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.LinkedHashMap;


public class TesteMenus {
    Driver driverWeb;
    WebDriver driver;
    PrincipalSissPage principalSissPage;
    SelecionarUnidadePage selecionarUnidadePage;
    MenuPrincipalPage menuPrincipalPage;

    //Abrindo o Navegador para iniciar o teste
    @Before
    public void inicializaTeste(){
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("http://qualidade.manutencao.sissonline.com.br");
        principalSissPage = new PrincipalSissPage(driver);
    }

    @Test
    public void testarMenus() throws InterruptedException {
//Definindo Cartão e Senha a ser utilizado
        String usuarioTexto = "985785826";
        String senhaTexto = "Luiza7anos";
        WebElement campoCard = driver.findElement(By.id("txtCardNumber"));
        campoCard.sendKeys(usuarioTexto);
        WebElement campoSenha = driver.findElement(By.id("txtSenha"));
        campoSenha.sendKeys(senhaTexto);
        principalSissPage.getBtnEntrar();

//Finalizando o login com o Challenge
        String xpathChallenge = "//*[@id=\"ChallengeFields\"]/div/span";
        Thread.sleep(5000);
        WebElement idChallenge = driver.findElement(By.xpath(xpathChallenge));
        WebElement result = driver.findElement(By.id("txt_:_0"));
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1:A", "v"); map.put("1:B", "6"); map.put("1:C", "E"); map.put("1:D", "8");
        map.put("2:A", "V"); map.put("2:B", "T"); map.put("2:C", "j"); map.put("2:D", "7");
        map.put("3:A", "M"); map.put("3:B", "v"); map.put("3:C", "N"); map.put("3:D", "1");
        map.put("4:A", "q"); map.put("4:B", "A"); map.put("4:C", "1"); map.put("4:D", "n");
        result.sendKeys(map.get(idChallenge.getText()));

        principalSissPage.getBtnEntrar();
        Thread.sleep(5000);
//Selecionar Unidade
        selecionarUnidadePage = new SelecionarUnidadePage(driver);
        selecionarUnidadePage.inpUnidade();
//Menus
        menuPrincipalPage = new MenuPrincipalPage(driver);
        menuPrincipalPage.clickEstabelecimento();
        menuPrincipalPage.clickSaudeFamilia();
        menuPrincipalPage.clickConfiguracao();
        menuPrincipalPage.clickAlmoxarifado();
        menuPrincipalPage.clickFarmacia();
        menuPrincipalPage.clickAtencaoSaude();
        menuPrincipalPage.clickEpidemiologia();
        menuPrincipalPage.clickAgenda();
        menuPrincipalPage.clickGestor();
        menuPrincipalPage.clickLaboratorio();
        menuPrincipalPage.clickCopiaSeguranca();
        menuPrincipalPage.clickVigilanciaSanitaria();
        menuPrincipalPage.clickInformacoes();
        menuPrincipalPage.clickSamu();
        menuPrincipalPage.clickCDS();
        menuPrincipalPage.clickFaturamento();
        menuPrincipalPage.clickHospitalar();
        menuPrincipalPage.clickTelemedicina();
        menuPrincipalPage.clickBI();
    }

    @After
    public void finalizaTeste(){
        driver.quit();  // fechando o navegador e a sessão
    }
}
